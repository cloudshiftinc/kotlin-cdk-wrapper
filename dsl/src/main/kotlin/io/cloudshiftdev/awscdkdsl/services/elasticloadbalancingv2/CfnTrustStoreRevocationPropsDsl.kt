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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps

/**
 * Properties for defining a `CfnTrustStoreRevocation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * CfnTrustStoreRevocationProps cfnTrustStoreRevocationProps =
 * CfnTrustStoreRevocationProps.builder()
 * .revocationContents(List.of(RevocationContentProperty.builder()
 * .revocationType("revocationType")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .s3ObjectVersion("s3ObjectVersion")
 * .build()))
 * .trustStoreArn("trustStoreArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html)
 */
@CdkDslMarker
public class CfnTrustStoreRevocationPropsDsl {
    private val cdkBuilder: CfnTrustStoreRevocationProps.Builder =
        CfnTrustStoreRevocationProps.builder()

    private val _revocationContents: MutableList<Any> = mutableListOf()

    /** @param revocationContents The revocation file to add. */
    public fun revocationContents(vararg revocationContents: Any) {
        _revocationContents.addAll(listOf(*revocationContents))
    }

    /** @param revocationContents The revocation file to add. */
    public fun revocationContents(revocationContents: Collection<Any>) {
        _revocationContents.addAll(revocationContents)
    }

    /** @param revocationContents The revocation file to add. */
    public fun revocationContents(revocationContents: IResolvable) {
        cdkBuilder.revocationContents(revocationContents)
    }

    /** @param trustStoreArn The Amazon Resource Name (ARN) of the trust store. */
    public fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
    }

    public fun build(): CfnTrustStoreRevocationProps {
        if (_revocationContents.isNotEmpty()) cdkBuilder.revocationContents(_revocationContents)
        return cdkBuilder.build()
    }
}