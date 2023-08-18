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

package io.cloudshiftdev.awscdkdsl.services.efs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnFileSystem

/**
 * Describes a policy used by EFS lifecycle management and EFS Intelligent-Tiering that specifies
 * when to transition files into and out of the file system's Infrequent Access (IA) storage class.
 *
 * For more information, see
 * [EFS Intelligent‐Tiering and EFS Lifecycle Management](https://docs.aws.amazon.com/efs/latest/ug/lifecycle-management-efs.html)
 * .
 * * Each `LifecyclePolicy` object can have only a single transition. This means that in a request
 *   body, `LifecyclePolicies` must be structured as an array of `LifecyclePolicy` objects, one
 *   object for each transition, `TransitionToIA` , `TransitionToPrimaryStorageClass` .
 * * See the AWS::EFS::FileSystem examples for the correct `LifecyclePolicy` structure. Do not use
 *   the syntax shown on this page.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * LifecyclePolicyProperty lifecyclePolicyProperty = LifecyclePolicyProperty.builder()
 * .transitionToIa("transitionToIa")
 * .transitionToPrimaryStorageClass("transitionToPrimaryStorageClass")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html)
 */
@CdkDslMarker
public class CfnFileSystemLifecyclePolicyPropertyDsl {
    private val cdkBuilder: CfnFileSystem.LifecyclePolicyProperty.Builder =
        CfnFileSystem.LifecyclePolicyProperty.builder()

    /**
     * @param transitionToIa Describes the period of time that a file is not accessed, after which
     *   it transitions to IA storage. Metadata operations such as listing the contents of a
     *   directory don't count as file access events.
     */
    public fun transitionToIa(transitionToIa: String) {
        cdkBuilder.transitionToIa(transitionToIa)
    }

    /**
     * @param transitionToPrimaryStorageClass Describes when to transition a file from IA storage to
     *   primary storage. Metadata operations such as listing the contents of a directory don't
     *   count as file access events.
     */
    public fun transitionToPrimaryStorageClass(transitionToPrimaryStorageClass: String) {
        cdkBuilder.transitionToPrimaryStorageClass(transitionToPrimaryStorageClass)
    }

    public fun build(): CfnFileSystem.LifecyclePolicyProperty = cdkBuilder.build()
}
