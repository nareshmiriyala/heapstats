/*
 * Copyright (C) 2014-2016 Yasumasa Suenaga
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package jp.co.ntt.oss.heapstats.plugin.builtin.log;

import java.util.Optional;
import javafx.util.StringConverter;
import jp.co.ntt.oss.heapstats.container.log.ArchiveData;
import jp.co.ntt.oss.heapstats.utils.HeapStatsUtils;

/**
 * This class converts LocalDateTime in ArchiveData to String.
 * This class DO NOT support fromString() method.
 * 
 * @author Yasumasa Suenaga
 */
public class ArchiveDataConverter extends StringConverter<ArchiveData>{

    @Override
    public String toString(ArchiveData object) {
        return Optional.ofNullable(object)
                       .map(o -> o.getDate().format(HeapStatsUtils.getDateTimeFormatter()))
                       .orElse(null);
    }

    @Override
    public ArchiveData fromString(String string) {
        throw new UnsupportedOperationException("ArchiveData DO NOT convert from String.");
    }
    
}
