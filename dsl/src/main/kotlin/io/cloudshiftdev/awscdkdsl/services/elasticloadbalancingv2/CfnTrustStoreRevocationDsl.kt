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
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation
import software.constructs.Construct

/**
 * Adds the specified revocation contents to the specified trust store.
 *
 * You must specify `TrustStoreArn` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * CfnTrustStoreRevocation cfnTrustStoreRevocation = CfnTrustStoreRevocation.Builder.create(this,
 * "MyCfnTrustStoreRevocation")
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
public class CfnTrustStoreRevocationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrustStoreRevocation.Builder =
        CfnTrustStoreRevocation.Builder.create(scope, id)

    private val _revocationContents: MutableList<Any> = mutableListOf()

    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     *
     * @param revocationContents The revocation file to add.
     */
    public fun revocationContents(vararg revocationContents: Any) {
        _revocationContents.addAll(listOf(*revocationContents))
    }

    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     *
     * @param revocationContents The revocation file to add.
     */
    public fun revocationContents(revocationContents: Collection<Any>) {
        _revocationContents.addAll(revocationContents)
    }

    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     *
     * @param revocationContents The revocation file to add.
     */
    public fun revocationContents(revocationContents: IResolvable) {
        cdkBuilder.revocationContents(revocationContents)
    }

    /**
     * The Amazon Resource Name (ARN) of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorearn)
     *
     * @param trustStoreArn The Amazon Resource Name (ARN) of the trust store.
     */
    public fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
    }

    public fun build(): CfnTrustStoreRevocation {
        if (_revocationContents.isNotEmpty()) cdkBuilder.revocationContents(_revocationContents)
        return cdkBuilder.build()
    }
}
