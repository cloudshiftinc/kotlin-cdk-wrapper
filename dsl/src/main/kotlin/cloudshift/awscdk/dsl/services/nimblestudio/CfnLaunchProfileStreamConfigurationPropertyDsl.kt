@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLaunchProfileStreamConfigurationPropertyDsl {
    private val cdkBuilder: CfnLaunchProfile.StreamConfigurationProperty.Builder =
        CfnLaunchProfile.StreamConfigurationProperty.builder()

    private val _ec2InstanceTypes: MutableList<String> = mutableListOf()

    private val _streamingImageIds: MutableList<String> = mutableListOf()

    public fun automaticTerminationMode(automaticTerminationMode: String) {
        cdkBuilder.automaticTerminationMode(automaticTerminationMode)
    }

    public fun clipboardMode(clipboardMode: String) {
        cdkBuilder.clipboardMode(clipboardMode)
    }

    public fun ec2InstanceTypes(vararg ec2InstanceTypes: String) {
        _ec2InstanceTypes.addAll(listOf(*ec2InstanceTypes))
    }

    public fun ec2InstanceTypes(ec2InstanceTypes: Collection<String>) {
        _ec2InstanceTypes.addAll(ec2InstanceTypes)
    }

    public fun maxSessionLengthInMinutes(maxSessionLengthInMinutes: Number) {
        cdkBuilder.maxSessionLengthInMinutes(maxSessionLengthInMinutes)
    }

    public fun maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes: Number) {
        cdkBuilder.maxStoppedSessionLengthInMinutes(maxStoppedSessionLengthInMinutes)
    }

    public fun sessionBackup(sessionBackup: IResolvable) {
        cdkBuilder.sessionBackup(sessionBackup)
    }

    public fun sessionBackup(sessionBackup: CfnLaunchProfile.StreamConfigurationSessionBackupProperty) {
        cdkBuilder.sessionBackup(sessionBackup)
    }

    public fun sessionPersistenceMode(sessionPersistenceMode: String) {
        cdkBuilder.sessionPersistenceMode(sessionPersistenceMode)
    }

    public fun sessionStorage(sessionStorage: IResolvable) {
        cdkBuilder.sessionStorage(sessionStorage)
    }

    public fun sessionStorage(sessionStorage: CfnLaunchProfile.StreamConfigurationSessionStorageProperty) {
        cdkBuilder.sessionStorage(sessionStorage)
    }

    public fun streamingImageIds(vararg streamingImageIds: String) {
        _streamingImageIds.addAll(listOf(*streamingImageIds))
    }

    public fun streamingImageIds(streamingImageIds: Collection<String>) {
        _streamingImageIds.addAll(streamingImageIds)
    }

    public fun volumeConfiguration(volumeConfiguration: IResolvable) {
        cdkBuilder.volumeConfiguration(volumeConfiguration)
    }

    public fun volumeConfiguration(volumeConfiguration: CfnLaunchProfile.VolumeConfigurationProperty) {
        cdkBuilder.volumeConfiguration(volumeConfiguration)
    }

    public fun build(): CfnLaunchProfile.StreamConfigurationProperty {
        if (_ec2InstanceTypes.isNotEmpty()) cdkBuilder.ec2InstanceTypes(_ec2InstanceTypes)
        if (_streamingImageIds.isNotEmpty()) cdkBuilder.streamingImageIds(_streamingImageIds)
        return cdkBuilder.build()
    }
}
