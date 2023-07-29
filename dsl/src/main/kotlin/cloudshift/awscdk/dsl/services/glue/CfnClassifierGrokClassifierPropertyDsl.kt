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
 * A classifier that uses `grok` patterns.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * GrokClassifierProperty grokClassifierProperty = GrokClassifierProperty.builder()
 * .classification("classification")
 * .grokPattern("grokPattern")
 * // the properties below are optional
 * .customPatterns("customPatterns")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-grokclassifier.html)
 */
@CdkDslMarker
public class CfnClassifierGrokClassifierPropertyDsl {
    private val cdkBuilder: CfnClassifier.GrokClassifierProperty.Builder =
        CfnClassifier.GrokClassifierProperty.builder()

    /**
     * @param classification An identifier of the data format that the classifier matches, such as
     *   Twitter, JSON, Omniture logs, and so on.
     */
    public fun classification(classification: String) {
        cdkBuilder.classification(classification)
    }

    /**
     * @param customPatterns Optional custom grok patterns defined by this classifier. For more
     *   information, see custom patterns in
     *   [Writing Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html)
     *   .
     */
    public fun customPatterns(customPatterns: String) {
        cdkBuilder.customPatterns(customPatterns)
    }

    /**
     * @param grokPattern The grok pattern applied to a data store by this classifier. For more
     *   information, see built-in patterns in
     *   [Writing Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html)
     *   .
     */
    public fun grokPattern(grokPattern: String) {
        cdkBuilder.grokPattern(grokPattern)
    }

    /** @param name The name of the classifier. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnClassifier.GrokClassifierProperty = cdkBuilder.build()
}
