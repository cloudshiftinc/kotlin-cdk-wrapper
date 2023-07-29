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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * The information required to specify a Maven reference.
 *
 * You can use Maven references to specify dependency JAR files.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * MavenReferenceProperty mavenReferenceProperty = MavenReferenceProperty.builder()
 * .artifactId("artifactId")
 * .groupId("groupId")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-mavenreference.html)
 */
@CdkDslMarker
public class CfnApplicationMavenReferencePropertyDsl {
    private val cdkBuilder: CfnApplication.MavenReferenceProperty.Builder =
        CfnApplication.MavenReferenceProperty.builder()

    /** @param artifactId The artifact ID of the Maven reference. */
    public fun artifactId(artifactId: String) {
        cdkBuilder.artifactId(artifactId)
    }

    /** @param groupId The group ID of the Maven reference. */
    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    /** @param version The version of the Maven reference. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnApplication.MavenReferenceProperty = cdkBuilder.build()
}
