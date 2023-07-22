@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile

@CdkDslMarker
public class CfnLaunchProfileStreamConfigurationPropertyDsl {
  private val cdkBuilder: CfnLaunchProfile.StreamConfigurationProperty.Builder =
      CfnLaunchProfile.StreamConfigurationProperty.builder()

  private val _ec2InstanceTypes: MutableList<String> = mutableListOf()

  private val _streamingImageIds: MutableList<String> = mutableListOf()

  /**
   * @param automaticTerminationMode the value to be set.
   */
  public fun automaticTerminationMode(automaticTerminationMode: String) {
    cdkBuilder.automaticTerminationMode(automaticTerminationMode)
  }

  /**
   * @param clipboardMode Allows or deactivates the use of the system clipboard to copy and paste
   * between the streaming session and streaming client. 
   */
  public fun clipboardMode(clipboardMode: String) {
    cdkBuilder.clipboardMode(clipboardMode)
  }

  /**
   * @param ec2InstanceTypes The EC2 instance types that users can select from when launching a
   * streaming session with this launch profile. 
   */
  public fun ec2InstanceTypes(vararg ec2InstanceTypes: String) {
    _ec2InstanceTypes.addAll(listOf(*ec2InstanceTypes))
  }

  /**
   * @param ec2InstanceTypes The EC2 instance types that users can select from when launching a
   * streaming session with this launch profile. 
   */
  public fun ec2InstanceTypes(ec2InstanceTypes: Collection<String>) {
    _ec2InstanceTypes.addAll(ec2InstanceTypes)
  }

  /**
   * @param maxSessionLengthInMinutes The length of time, in minutes, that a streaming session can
   * be active before it is stopped or terminated.
   * After this point, Nimble Studio automatically terminates or stops the session. The default
   * length of time is 690 minutes, and the maximum length of time is 30 days.
   */
  public fun maxSessionLengthInMinutes(maxSessionLengthInMinutes: Number) {
    cdkBuilder.maxSessionLengthInMinutes(maxSessionLengthInMinutes)
  }

  /**
   * @param maxStoppedSessionLengthInMinutes Integer that determines if you can start and stop your
   * sessions and how long a session can stay in the `STOPPED` state.
   * The default value is 0. The maximum value is 5760.
   *
   * This field is allowed only when `sessionPersistenceMode` is `ACTIVATED` and
   * `automaticTerminationMode` is `ACTIVATED` .
   *
   * If the value is set to 0, your sessions can’t be `STOPPED` . If you then call
   * `StopStreamingSession` , the session fails. If the time that a session stays in the `READY` state
   * exceeds the `maxSessionLengthInMinutes` value, the session will automatically be terminated
   * (instead of `STOPPED` ).
   *
   * If the value is set to a positive number, the session can be stopped. You can call
   * `StopStreamingSession` to stop sessions in the `READY` state. If the time that a session stays in
   * the `READY` state exceeds the `maxSessionLengthInMinutes` value, the session will automatically be
   * stopped (instead of terminated).
   */
  public fun maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes: Number) {
    cdkBuilder.maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes)
  }

  /**
   * @param sessionBackup Configures how streaming sessions are backed up when launched from this
   * launch             profile.</p>.
   */
  public fun sessionBackup(sessionBackup: IResolvable) {
    cdkBuilder.sessionBackup(sessionBackup)
  }

  /**
   * @param sessionBackup Configures how streaming sessions are backed up when launched from this
   * launch             profile.</p>.
   */
  public
      fun sessionBackup(sessionBackup: CfnLaunchProfile.StreamConfigurationSessionBackupProperty) {
    cdkBuilder.sessionBackup(sessionBackup)
  }

  /**
   * @param sessionPersistenceMode the value to be set.
   */
  public fun sessionPersistenceMode(sessionPersistenceMode: String) {
    cdkBuilder.sessionPersistenceMode(sessionPersistenceMode)
  }

  /**
   * @param sessionStorage The upload storage for a streaming session.
   */
  public fun sessionStorage(sessionStorage: IResolvable) {
    cdkBuilder.sessionStorage(sessionStorage)
  }

  /**
   * @param sessionStorage The upload storage for a streaming session.
   */
  public
      fun sessionStorage(sessionStorage: CfnLaunchProfile.StreamConfigurationSessionStorageProperty) {
    cdkBuilder.sessionStorage(sessionStorage)
  }

  /**
   * @param streamingImageIds The streaming images that users can select from when launching a
   * streaming session with this launch profile. 
   */
  public fun streamingImageIds(vararg streamingImageIds: String) {
    _streamingImageIds.addAll(listOf(*streamingImageIds))
  }

  /**
   * @param streamingImageIds The streaming images that users can select from when launching a
   * streaming session with this launch profile. 
   */
  public fun streamingImageIds(streamingImageIds: Collection<String>) {
    _streamingImageIds.addAll(streamingImageIds)
  }

  /**
   * @param volumeConfiguration Custom volume configuration for the root volumes that are attached
   * to streaming             sessions.</p>          This parameter is only allowed when
   * `sessionPersistenceMode` is                 `ACTIVATED`.</p>.
   */
  public fun volumeConfiguration(volumeConfiguration: IResolvable) {
    cdkBuilder.volumeConfiguration(volumeConfiguration)
  }

  /**
   * @param volumeConfiguration Custom volume configuration for the root volumes that are attached
   * to streaming             sessions.</p>          This parameter is only allowed when
   * `sessionPersistenceMode` is                 `ACTIVATED`.</p>.
   */
  public
      fun volumeConfiguration(volumeConfiguration: CfnLaunchProfile.VolumeConfigurationProperty) {
    cdkBuilder.volumeConfiguration(volumeConfiguration)
  }

  public fun build(): CfnLaunchProfile.StreamConfigurationProperty {
    if(_ec2InstanceTypes.isNotEmpty()) cdkBuilder.ec2InstanceTypes(_ec2InstanceTypes)
    if(_streamingImageIds.isNotEmpty()) cdkBuilder.streamingImageIds(_streamingImageIds)
    return cdkBuilder.build()
  }
}
