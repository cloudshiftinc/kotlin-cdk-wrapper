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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * The information required to specify a Maven reference.
 *
 * You can use Maven references to specify dependency JAR files.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
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
public class CfnApplicationV2MavenReferencePropertyDsl {
    private val cdkBuilder: CfnApplicationV2.MavenReferenceProperty.Builder =
        CfnApplicationV2.MavenReferenceProperty.builder()

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

    public fun build(): CfnApplicationV2.MavenReferenceProperty = cdkBuilder.build()
}
