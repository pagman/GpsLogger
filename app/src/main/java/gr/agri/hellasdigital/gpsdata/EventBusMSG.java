/**
 * EventBusMSG - Java Class for Android
 * Created by G.Capelli (BasicAirData) on 05/08/17.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package gr.agri.hellasdigital.gpsdata;

public class EventBusMSG {

    static final short APP_RESUME                       =   1;  // Sent to components on app resume
    static final short APP_PAUSE                        =   2;  // Sent to components on app pause
    static final short NEW_TRACK                        =   3;  // Request to create a new track
    static final short UPDATE_FIX                       =   4;  // Notify that a new fix is available
    static final short UPDATE_TRACK                     =   5;  // Notify that the current track stats are updated
    static final short UPDATE_TRACKLIST                 =   6;  // Notify that the tracklist is changed
    static final short UPDATE_SETTINGS                  =   7;  // Tell that settings are changed
    static final short REQUEST_ADD_PLACEMARK            =   8;  // The user ask to add a placemark
    static final short ADD_PLACEMARK                    =   9;  // The placemark is available
    static final short APPLY_SETTINGS                   =  10;  // The new settings must be applied
    static final short TOAST_TRACK_EXPORTED             =  11;  // The exporter has finished to export the track, shows toast
    static final short STORAGE_PERMISSION_REQUIRED      =  12;  // The Storage permission is required
    static final short UPDATE_JOB_PROGRESS              =  13;  // Update the progress of the current Job
    static final short NOTIFY_TRACKS_DELETED            =  14;  // Notify that some tracks are deleted

    static final short TRACK_EXPORTED                   =  24;  // The exporter has finished to process the track (given id)
    static final short TRACKLIST_SELECTION              =  25;  // The user select (into the tracklist) the track with a given id
    static final short INTENT_SEND                      =  26;  // Request to share
    static final short TOAST_UNABLE_TO_WRITE_THE_FILE   =  27;  // Exporter fails to export the Track (given id)

    static final short TRACK_SETPROGRESS                =  30;  // Change the progress value of the Track (given id)

    static final short ACTION_BULK_DELETE_TRACKS        =  40;  // Delete the selected tracks
    static final short ACTION_BULK_EXPORT_TRACKS        =  41;  // Export the selected tracks
    static final short ACTION_BULK_VIEW_TRACKS          =  42;  // View the selected tracks
    static final short ACTION_BULK_SHARE_TRACKS         =  43;  // Share the selected tracks
}
