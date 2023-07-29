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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnClassifier
import software.amazon.awscdk.services.glue.CfnClassifierProps

/**
 * Properties for defining a `CfnClassifier`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnClassifierProps cfnClassifierProps = CfnClassifierProps.builder()
 * .csvClassifier(CsvClassifierProperty.builder()
 * .allowSingleColumn(false)
 * .containsHeader("containsHeader")
 * .delimiter("delimiter")
 * .disableValueTrimming(false)
 * .header(List.of("header"))
 * .name("name")
 * .quoteSymbol("quoteSymbol")
 * .build())
 * .grokClassifier(GrokClassifierProperty.builder()
 * .classification("classification")
 * .grokPattern("grokPattern")
 * // the properties below are optional
 * .customPatterns("customPatterns")
 * .name("name")
 * .build())
 * .jsonClassifier(JsonClassifierProperty.builder()
 * .jsonPath("jsonPath")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .xmlClassifier(XMLClassifierProperty.builder()
 * .classification("classification")
 * .rowTag("rowTag")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html)
 */
@CdkDslMarker
public class CfnClassifierPropsDsl {
    private val cdkBuilder: CfnClassifierProps.Builder = CfnClassifierProps.builder()

    /** @param csvClassifier A classifier for comma-separated values (CSV). */
    public fun csvClassifier(csvClassifier: IResolvable) {
        cdkBuilder.csvClassifier(csvClassifier)
    }

    /** @param csvClassifier A classifier for comma-separated values (CSV). */
    public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty) {
        cdkBuilder.csvClassifier(csvClassifier)
    }

    /** @param grokClassifier A classifier that uses `grok` . */
    public fun grokClassifier(grokClassifier: IResolvable) {
        cdkBuilder.grokClassifier(grokClassifier)
    }

    /** @param grokClassifier A classifier that uses `grok` . */
    public fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty) {
        cdkBuilder.grokClassifier(grokClassifier)
    }

    /** @param jsonClassifier A classifier for JSON content. */
    public fun jsonClassifier(jsonClassifier: IResolvable) {
        cdkBuilder.jsonClassifier(jsonClassifier)
    }

    /** @param jsonClassifier A classifier for JSON content. */
    public fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty) {
        cdkBuilder.jsonClassifier(jsonClassifier)
    }

    /** @param xmlClassifier A classifier for XML content. */
    public fun xmlClassifier(xmlClassifier: IResolvable) {
        cdkBuilder.xmlClassifier(xmlClassifier)
    }

    /** @param xmlClassifier A classifier for XML content. */
    public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty) {
        cdkBuilder.xmlClassifier(xmlClassifier)
    }

    public fun build(): CfnClassifierProps = cdkBuilder.build()
}
