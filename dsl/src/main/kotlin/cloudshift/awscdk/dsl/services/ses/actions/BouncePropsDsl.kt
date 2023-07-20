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
import software.amazon.awscdk.services.ses.actions.BounceProps
import software.amazon.awscdk.services.ses.actions.BounceTemplate
import software.amazon.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class BouncePropsDsl {
    private val cdkBuilder: BounceProps.Builder = BounceProps.builder()

    public fun sender(sender: String) {
        cdkBuilder.sender(sender)
    }

    public fun template(block: BounceTemplateDsl.() -> Unit = {}) {
        val builder = BounceTemplateDsl()
        builder.apply(block)
        cdkBuilder.template(builder.build())
    }

    public fun template(template: BounceTemplate) {
        cdkBuilder.template(template)
    }

    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): BounceProps = cdkBuilder.build()
}
