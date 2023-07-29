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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Defines settings to enable text conversation logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * TextLogSettingProperty textLogSettingProperty = TextLogSettingProperty.builder()
 * .destination(TextLogDestinationProperty.builder()
 * .cloudWatch(CloudWatchLogGroupLogDestinationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .logPrefix("logPrefix")
 * .build())
 * .build())
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textlogsetting.html)
 */
@CdkDslMarker
public class CfnBotTextLogSettingPropertyDsl {
    private val cdkBuilder: CfnBot.TextLogSettingProperty.Builder =
        CfnBot.TextLogSettingProperty.builder()

    /**
     * @param destination Specifies the Amazon CloudWatch Logs destination log group for
     *   conversation text logs.
     */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param destination Specifies the Amazon CloudWatch Logs destination log group for
     *   conversation text logs.
     */
    public fun destination(destination: CfnBot.TextLogDestinationProperty) {
        cdkBuilder.destination(destination)
    }

    /** @param enabled Determines whether conversation logs should be stored for an alias. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Determines whether conversation logs should be stored for an alias. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnBot.TextLogSettingProperty = cdkBuilder.build()
}
