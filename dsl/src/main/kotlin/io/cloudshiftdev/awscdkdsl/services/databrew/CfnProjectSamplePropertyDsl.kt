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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnProject

/**
 * Represents the sample size and sampling type for DataBrew to use for interactive data analysis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * SampleProperty sampleProperty = SampleProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .size(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-project-sample.html)
 */
@CdkDslMarker
public class CfnProjectSamplePropertyDsl {
    private val cdkBuilder: CfnProject.SampleProperty.Builder = CfnProject.SampleProperty.builder()

    /** @param size The number of rows in the sample. */
    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    /** @param type The way in which DataBrew obtains rows from a dataset. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.SampleProperty = cdkBuilder.build()
}
