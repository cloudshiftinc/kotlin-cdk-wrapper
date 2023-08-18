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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnClassifier
import software.constructs.Construct

/**
 * The `AWS::Glue::Classifier` resource creates an AWS Glue classifier that categorizes data sources
 * and specifies schemas.
 *
 * For more information, see
 * [Adding Classifiers to a Crawler](https://docs.aws.amazon.com/glue/latest/dg/add-classifier.html)
 * and
 * [Classifier Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-crawler-classifiers.html#aws-glue-api-crawler-classifiers-Classifier)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnClassifier cfnClassifier = CfnClassifier.Builder.create(this, "MyCfnClassifier")
 * .csvClassifier(CsvClassifierProperty.builder()
 * .allowSingleColumn(false)
 * .containsCustomDatatype(List.of("containsCustomDatatype"))
 * .containsHeader("containsHeader")
 * .customDatatypeConfigured(false)
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
public class CfnClassifierDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnClassifier.Builder = CfnClassifier.Builder.create(scope, id)

    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     *
     * @param csvClassifier A classifier for comma-separated values (CSV).
     */
    public fun csvClassifier(csvClassifier: IResolvable) {
        cdkBuilder.csvClassifier(csvClassifier)
    }

    /**
     * A classifier for comma-separated values (CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-csvclassifier)
     *
     * @param csvClassifier A classifier for comma-separated values (CSV).
     */
    public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty) {
        cdkBuilder.csvClassifier(csvClassifier)
    }

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     *
     * @param grokClassifier A classifier that uses `grok` .
     */
    public fun grokClassifier(grokClassifier: IResolvable) {
        cdkBuilder.grokClassifier(grokClassifier)
    }

    /**
     * A classifier that uses `grok` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-grokclassifier)
     *
     * @param grokClassifier A classifier that uses `grok` .
     */
    public fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty) {
        cdkBuilder.grokClassifier(grokClassifier)
    }

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     *
     * @param jsonClassifier A classifier for JSON content.
     */
    public fun jsonClassifier(jsonClassifier: IResolvable) {
        cdkBuilder.jsonClassifier(jsonClassifier)
    }

    /**
     * A classifier for JSON content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-jsonclassifier)
     *
     * @param jsonClassifier A classifier for JSON content.
     */
    public fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty) {
        cdkBuilder.jsonClassifier(jsonClassifier)
    }

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     *
     * @param xmlClassifier A classifier for XML content.
     */
    public fun xmlClassifier(xmlClassifier: IResolvable) {
        cdkBuilder.xmlClassifier(xmlClassifier)
    }

    /**
     * A classifier for XML content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-classifier.html#cfn-glue-classifier-xmlclassifier)
     *
     * @param xmlClassifier A classifier for XML content.
     */
    public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty) {
        cdkBuilder.xmlClassifier(xmlClassifier)
    }

    public fun build(): CfnClassifier = cdkBuilder.build()
}
