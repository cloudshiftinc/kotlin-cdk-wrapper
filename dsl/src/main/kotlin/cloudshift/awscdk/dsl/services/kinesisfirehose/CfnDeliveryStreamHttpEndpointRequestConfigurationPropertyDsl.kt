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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeliveryStreamHttpEndpointRequestConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.Builder =
        CfnDeliveryStream.HttpEndpointRequestConfigurationProperty.builder()

    private val _commonAttributes: MutableList<Any> = mutableListOf()

    public fun commonAttributes(vararg commonAttributes: Any) {
        _commonAttributes.addAll(listOf(*commonAttributes))
    }

    public fun commonAttributes(commonAttributes: Collection<Any>) {
        _commonAttributes.addAll(commonAttributes)
    }

    public fun commonAttributes(commonAttributes: IResolvable) {
        cdkBuilder.commonAttributes(commonAttributes)
    }

    public fun contentEncoding(contentEncoding: String) {
        cdkBuilder.contentEncoding(contentEncoding)
    }

    public fun build(): CfnDeliveryStream.HttpEndpointRequestConfigurationProperty {
        if (_commonAttributes.isNotEmpty()) cdkBuilder.commonAttributes(_commonAttributes)
        return cdkBuilder.build()
    }
}
