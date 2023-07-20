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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.nimblestudio.CfnStreamingImage
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnStreamingImageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStreamingImage.Builder = CfnStreamingImage.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun ec2ImageId(ec2ImageId: String) {
        cdkBuilder.ec2ImageId(ec2ImageId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun studioId(studioId: String) {
        cdkBuilder.studioId(studioId)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnStreamingImage = cdkBuilder.build()
}
