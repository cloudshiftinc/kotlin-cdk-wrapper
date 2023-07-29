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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnClassifier

/**
 * A classifier for `JSON` content.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * JsonClassifierProperty jsonClassifierProperty = JsonClassifierProperty.builder()
 * .jsonPath("jsonPath")
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-jsonclassifier.html)
 */
@CdkDslMarker
public class CfnClassifierJsonClassifierPropertyDsl {
    private val cdkBuilder: CfnClassifier.JsonClassifierProperty.Builder =
        CfnClassifier.JsonClassifierProperty.builder()

    /**
     * @param jsonPath A `JsonPath` string defining the JSON data for the classifier to classify.
     *   AWS Glue supports a subset of `JsonPath` , as described in
     *   [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json)
     *   .
     */
    public fun jsonPath(jsonPath: String) {
        cdkBuilder.jsonPath(jsonPath)
    }

    /** @param name The name of the classifier. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnClassifier.JsonClassifierProperty = cdkBuilder.build()
}
