@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

/**
 * An activity that adds other attributes based on existing attributes in the message.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * AddAttributesProperty addAttributesProperty = AddAttributesProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-addattributes.html)
 */
@CdkDslMarker
public class CfnPipelineAddAttributesPropertyDsl {
    private val cdkBuilder: CfnPipeline.AddAttributesProperty.Builder =
        CfnPipeline.AddAttributesProperty.builder()

    /**
     * @param attributes A list of 1-50 "AttributeNameMapping" objects that map an existing
     *   attribute to a new attribute.
     *
     * The existing attributes remain in the message, so if you want to remove the originals, use
     * "RemoveAttributeActivity".
     */
    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * @param attributes A list of 1-50 "AttributeNameMapping" objects that map an existing
     *   attribute to a new attribute.
     *
     * The existing attributes remain in the message, so if you want to remove the originals, use
     * "RemoveAttributeActivity".
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /** @param name The name of the 'addAttributes' activity. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param next The next activity in the pipeline. */
    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    public fun build(): CfnPipeline.AddAttributesProperty = cdkBuilder.build()
}
