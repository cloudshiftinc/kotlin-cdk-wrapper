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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup

/**
 * AWS Verified Access provides server side encryption by default to data at rest using AWS -owned
 * KMS keys.
 *
 * You also have the option of using customer managed KMS keys, which can be specified using the
 * options below.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SseSpecificationProperty sseSpecificationProperty = SseSpecificationProperty.builder()
 * .customerManagedKeyEnabled(false)
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-verifiedaccessgroup-ssespecification.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessGroupSseSpecificationPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessGroup.SseSpecificationProperty.Builder =
        CfnVerifiedAccessGroup.SseSpecificationProperty.builder()

    /**
     * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
     *   server side encryption. Valid values: `True` | `False`
     */
    public fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled)
    }

    /**
     * @param customerManagedKeyEnabled Enable or disable the use of customer managed KMS keys for
     *   server side encryption. Valid values: `True` | `False`
     */
    public fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled)
    }

    /** @param kmsKeyArn The ARN of the KMS key. */
    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun build(): CfnVerifiedAccessGroup.SseSpecificationProperty = cdkBuilder.build()
}
