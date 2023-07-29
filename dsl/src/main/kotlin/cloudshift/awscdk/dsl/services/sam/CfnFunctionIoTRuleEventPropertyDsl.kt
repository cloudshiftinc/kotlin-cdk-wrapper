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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * IoTRuleEventProperty ioTRuleEventProperty = IoTRuleEventProperty.builder()
 * .sql("sql")
 * // the properties below are optional
 * .awsIotSqlVersion("awsIotSqlVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-iotruleevent.html)
 */
@CdkDslMarker
public class CfnFunctionIoTRuleEventPropertyDsl {
    private val cdkBuilder: CfnFunction.IoTRuleEventProperty.Builder =
        CfnFunction.IoTRuleEventProperty.builder()

    /** @param awsIotSqlVersion the value to be set. */
    public fun awsIotSqlVersion(awsIotSqlVersion: String) {
        cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
    }

    /** @param sql the value to be set. */
    public fun sql(sql: String) {
        cdkBuilder.sql(sql)
    }

    public fun build(): CfnFunction.IoTRuleEventProperty = cdkBuilder.build()
}
