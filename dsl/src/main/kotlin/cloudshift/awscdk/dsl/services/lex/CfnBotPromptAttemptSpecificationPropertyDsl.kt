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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.Boolean

@CdkDslMarker
public class CfnBotPromptAttemptSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.PromptAttemptSpecificationProperty.Builder =
        CfnBot.PromptAttemptSpecificationProperty.builder()

    public fun allowInterrupt(allowInterrupt: Boolean) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    public fun allowInterrupt(allowInterrupt: IResolvable) {
        cdkBuilder.allowInterrupt(allowInterrupt)
    }

    public fun allowedInputTypes(allowedInputTypes: IResolvable) {
        cdkBuilder.allowedInputTypes(allowedInputTypes)
    }

    public fun allowedInputTypes(allowedInputTypes: CfnBot.AllowedInputTypesProperty) {
        cdkBuilder.allowedInputTypes(allowedInputTypes)
    }

    public fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: IResolvable) {
        cdkBuilder.audioAndDtmfInputSpecification(audioAndDtmfInputSpecification)
    }

    public fun audioAndDtmfInputSpecification(audioAndDtmfInputSpecification: CfnBot.AudioAndDTMFInputSpecificationProperty) {
        cdkBuilder.audioAndDtmfInputSpecification(audioAndDtmfInputSpecification)
    }

    public fun textInputSpecification(textInputSpecification: IResolvable) {
        cdkBuilder.textInputSpecification(textInputSpecification)
    }

    public fun textInputSpecification(textInputSpecification: CfnBot.TextInputSpecificationProperty) {
        cdkBuilder.textInputSpecification(textInputSpecification)
    }

    public fun build(): CfnBot.PromptAttemptSpecificationProperty = cdkBuilder.build()
}
