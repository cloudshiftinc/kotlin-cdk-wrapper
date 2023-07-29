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

package cloudshift.awscdk.dsl.services.cur

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cur.CfnReportDefinition
import software.amazon.awscdk.services.cur.CfnReportDefinitionProps
import software.constructs.Construct

public object cur {
    /**
     * The definition of AWS Cost and Usage Report.
     *
     * You can specify the report name, time unit, report format, compression format, S3 bucket,
     * additional artifacts, and schema elements in the definition.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cur.*;
     * CfnReportDefinition cfnReportDefinition = CfnReportDefinition.Builder.create(this,
     * "MyCfnReportDefinition")
     * .compression("compression")
     * .format("format")
     * .refreshClosedReports(false)
     * .reportName("reportName")
     * .reportVersioning("reportVersioning")
     * .s3Bucket("s3Bucket")
     * .s3Prefix("s3Prefix")
     * .s3Region("s3Region")
     * .timeUnit("timeUnit")
     * // the properties below are optional
     * .additionalArtifacts(List.of("additionalArtifacts"))
     * .additionalSchemaElements(List.of("additionalSchemaElements"))
     * .billingViewArn("billingViewArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html)
     */
    public inline fun cfnReportDefinition(
        scope: Construct,
        id: String,
        block: CfnReportDefinitionDsl.() -> Unit = {},
    ): CfnReportDefinition {
        val builder = CfnReportDefinitionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReportDefinition`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cur.*;
     * CfnReportDefinitionProps cfnReportDefinitionProps = CfnReportDefinitionProps.builder()
     * .compression("compression")
     * .format("format")
     * .refreshClosedReports(false)
     * .reportName("reportName")
     * .reportVersioning("reportVersioning")
     * .s3Bucket("s3Bucket")
     * .s3Prefix("s3Prefix")
     * .s3Region("s3Region")
     * .timeUnit("timeUnit")
     * // the properties below are optional
     * .additionalArtifacts(List.of("additionalArtifacts"))
     * .additionalSchemaElements(List.of("additionalSchemaElements"))
     * .billingViewArn("billingViewArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cur-reportdefinition.html)
     */
    public inline fun cfnReportDefinitionProps(
        block: CfnReportDefinitionPropsDsl.() -> Unit = {}
    ): CfnReportDefinitionProps {
        val builder = CfnReportDefinitionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
