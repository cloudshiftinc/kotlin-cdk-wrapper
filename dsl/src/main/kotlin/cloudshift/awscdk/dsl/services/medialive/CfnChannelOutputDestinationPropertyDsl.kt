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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnChannelOutputDestinationPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputDestinationProperty.Builder =
        CfnChannel.OutputDestinationProperty.builder()

    private val _mediaPackageSettings: MutableList<Any> = mutableListOf()

    private val _settings: MutableList<Any> = mutableListOf()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun mediaPackageSettings(vararg mediaPackageSettings: Any) {
        _mediaPackageSettings.addAll(listOf(*mediaPackageSettings))
    }

    public fun mediaPackageSettings(mediaPackageSettings: Collection<Any>) {
        _mediaPackageSettings.addAll(mediaPackageSettings)
    }

    public fun mediaPackageSettings(mediaPackageSettings: IResolvable) {
        cdkBuilder.mediaPackageSettings(mediaPackageSettings)
    }

    public fun multiplexSettings(multiplexSettings: IResolvable) {
        cdkBuilder.multiplexSettings(multiplexSettings)
    }

    public fun multiplexSettings(multiplexSettings: CfnChannel.MultiplexProgramChannelDestinationSettingsProperty) {
        cdkBuilder.multiplexSettings(multiplexSettings)
    }

    public fun settings(vararg settings: Any) {
        _settings.addAll(listOf(*settings))
    }

    public fun settings(settings: Collection<Any>) {
        _settings.addAll(settings)
    }

    public fun settings(settings: IResolvable) {
        cdkBuilder.settings(settings)
    }

    public fun build(): CfnChannel.OutputDestinationProperty {
        if (_mediaPackageSettings.isNotEmpty()) cdkBuilder.mediaPackageSettings(_mediaPackageSettings)
        if (_settings.isNotEmpty()) cdkBuilder.settings(_settings)
        return cdkBuilder.build()
    }
}
