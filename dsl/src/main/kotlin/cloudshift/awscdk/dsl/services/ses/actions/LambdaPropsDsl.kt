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

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.ses.actions.LambdaInvocationType
import software.amazon.awscdk.services.ses.actions.LambdaProps
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class LambdaPropsDsl {
    private val cdkBuilder: LambdaProps.Builder = LambdaProps.builder()

    public fun function(function: IFunction) {
        cdkBuilder.function(function)
    }

    public fun invocationType(invocationType: LambdaInvocationType) {
        cdkBuilder.invocationType(invocationType)
    }

    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): LambdaProps = cdkBuilder.build()
}
