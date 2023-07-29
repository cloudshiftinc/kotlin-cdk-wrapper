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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnMissionProfile

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * StreamsKmsKeyProperty streamsKmsKeyProperty = StreamsKmsKeyProperty.builder()
 * .kmsAliasArn("kmsAliasArn")
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-streamskmskey.html)
 */
@CdkDslMarker
public class CfnMissionProfileStreamsKmsKeyPropertyDsl {
    private val cdkBuilder: CfnMissionProfile.StreamsKmsKeyProperty.Builder =
        CfnMissionProfile.StreamsKmsKeyProperty.builder()

    /** @param kmsAliasArn the value to be set. */
    public fun kmsAliasArn(kmsAliasArn: String) {
        cdkBuilder.kmsAliasArn(kmsAliasArn)
    }

    /** @param kmsKeyArn the value to be set. */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun build(): CfnMissionProfile.StreamsKmsKeyProperty = cdkBuilder.build()
}
