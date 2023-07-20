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
import software.amazon.awscdk.services.ses.actions.EmailEncoding
import software.amazon.awscdk.services.ses.actions.SnsProps
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class SnsPropsDsl {
    private val cdkBuilder: SnsProps.Builder = SnsProps.builder()

    public fun encoding(encoding: EmailEncoding) {
        cdkBuilder.encoding(encoding)
    }

    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): SnsProps = cdkBuilder.build()
}
