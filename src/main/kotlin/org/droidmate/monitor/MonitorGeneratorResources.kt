// DroidMate, an automated execution generator for Android apps.
// Copyright (C) 2012-2018. Saarland University
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// Current Maintainers:
// Nataniel Borges Jr. <nataniel dot borges at cispa dot saarland>
// Jenny Hotzkow <jenny dot hotzkow at cispa dot saarland>
//
// Former Maintainers:
// Konrad Jamrozik <jamrozik at st dot cs dot uni-saarland dot de>
//
// web: www.droidmate.org

package org.droidmate.monitor

/*import org.droidmate.legacy.ResourcePath
import org.droidmate.misc.EnvironmentConstants
import java.nio.file.Files

import java.nio.file.Path
import java.nio.file.Paths

class MonitorGeneratorResources {

	val monitorSrcTemplatePath: Path
	val monitorSrcOutPath: Path
	val monitoredApis: Path

	init {
		val monitorSrcOut = Paths.get(EnvironmentConstants.monitor_generator_output_relative_path_api23)

		assert(Files.notExists(monitorSrcOut) || Files.isWritable(monitorSrcOut))
		this.monitorSrcOutPath = monitorSrcOut

		val monitorSrcTemplatePath = ResourcePath(EnvironmentConstants.monitor_generator_res_name_monitor_template).path
		this.monitorSrcTemplatePath = monitorSrcTemplatePath

		val monitoredApis = ResourcePath("monitored_apis.json").path
		this.monitoredApis = monitoredApis
	}
}*/