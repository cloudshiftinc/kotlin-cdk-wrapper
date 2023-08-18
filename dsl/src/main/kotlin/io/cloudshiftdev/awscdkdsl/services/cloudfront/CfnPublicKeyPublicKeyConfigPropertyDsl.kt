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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnPublicKey

/**
 * Configuration information about a public key that you can use with
 * [signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
 * , or with
 * [field-level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * PublicKeyConfigProperty publicKeyConfigProperty = PublicKeyConfigProperty.builder()
 * .callerReference("callerReference")
 * .encodedKey("encodedKey")
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html)
 */
@CdkDslMarker
public class CfnPublicKeyPublicKeyConfigPropertyDsl {
    private val cdkBuilder: CfnPublicKey.PublicKeyConfigProperty.Builder =
        CfnPublicKey.PublicKeyConfigProperty.builder()

    /**
     * @param callerReference A string included in the request to help make sure that the request
     *   can't be replayed.
     */
    public fun callerReference(callerReference: String) {
        cdkBuilder.callerReference(callerReference)
    }

    /**
     * @param comment A comment to describe the public key. The comment cannot be longer than 128
     *   characters.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param encodedKey The public key that you can use with
     *   [signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     *   , or with
     *   [field-level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     *   .
     */
    public fun encodedKey(encodedKey: String) {
        cdkBuilder.encodedKey(encodedKey)
    }

    /** @param name A name to help identify the public key. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPublicKey.PublicKeyConfigProperty = cdkBuilder.build()
}
