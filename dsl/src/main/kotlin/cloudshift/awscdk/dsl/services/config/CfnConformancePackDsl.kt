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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConformancePack
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConformancePackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConformancePack.Builder = CfnConformancePack.Builder.create(scope, id)

    private val _conformancePackInputParameters: MutableList<Any> = mutableListOf()

    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any) {
        _conformancePackInputParameters.addAll(listOf(*conformancePackInputParameters))
    }

    public fun conformancePackInputParameters(conformancePackInputParameters: Collection<Any>) {
        _conformancePackInputParameters.addAll(conformancePackInputParameters)
    }

    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
        cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    public fun conformancePackName(conformancePackName: String) {
        cdkBuilder.conformancePackName(conformancePackName)
    }

    public fun deliveryS3Bucket(deliveryS3Bucket: String) {
        cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
        cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    public fun templateS3Uri(templateS3Uri: String) {
        cdkBuilder.templateS3Uri(templateS3Uri)
    }

    public fun templateSsmDocumentDetails(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.templateSsmDocumentDetails(builder.map)
    }

    public fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any) {
        cdkBuilder.templateSsmDocumentDetails(templateSsmDocumentDetails)
    }

    public fun build(): CfnConformancePack {
        if (_conformancePackInputParameters.isNotEmpty()) {
            cdkBuilder.conformancePackInputParameters(_conformancePackInputParameters)
        }
        return cdkBuilder.build()
    }
}
