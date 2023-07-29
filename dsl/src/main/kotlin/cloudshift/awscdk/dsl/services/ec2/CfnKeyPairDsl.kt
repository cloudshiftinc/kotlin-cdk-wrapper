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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnKeyPair
import software.constructs.Construct

/**
 * Specifies a key pair for use with an Amazon Elastic Compute Cloud instance as follows:.
 * * To import an existing key pair, include the `PublicKeyMaterial` property.
 * * To create a new key pair, omit the `PublicKeyMaterial` property.
 *
 * When you import an existing key pair, you specify the public key material for the key. We assume
 * that you have the private key material for the key. AWS CloudFormation does not create or return
 * the private key material when you import a key pair.
 *
 * When you create a new key pair, the private key is saved to AWS Systems Manager Parameter Store,
 * using a parameter with the following name: `/ec2/keypair/{key_pair_id}` . For more information
 * about retrieving private key, and the required permissions, see
 * [Create a key pair using AWS CloudFormation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/create-key-pairs.html#create-key-pair-cloudformation)
 * in the *Amazon EC2 User Guide* .
 *
 * When AWS CloudFormation deletes a key pair that was created or imported by a stack, it also
 * deletes the parameter that was used to store the private key material in Parameter Store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnKeyPair cfnKeyPair = CfnKeyPair.Builder.create(this, "MyCfnKeyPair")
 * .keyName("keyName")
 * // the properties below are optional
 * .keyFormat("keyFormat")
 * .keyType("keyType")
 * .publicKeyMaterial("publicKeyMaterial")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html)
 */
@CdkDslMarker
public class CfnKeyPairDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnKeyPair.Builder = CfnKeyPair.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The format of the key pair.
     *
     * Default: `pem`
     *
     * Default: - "pem"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyformat)
     *
     * @param keyFormat The format of the key pair.
     */
    public fun keyFormat(keyFormat: String) {
        cdkBuilder.keyFormat(keyFormat)
    }

    /**
     * A unique name for the key pair.
     *
     * Constraints: Up to 255 ASCII characters
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keyname)
     *
     * @param keyName A unique name for the key pair.
     */
    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    /**
     * The type of key pair. Note that ED25519 keys are not supported for Windows instances.
     *
     * If the `PublicKeyMaterial` property is specified, the `KeyType` property is ignored, and the
     * key type is inferred from the `PublicKeyMaterial` value.
     *
     * Default: `rsa`
     *
     * Default: - "rsa"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-keytype)
     *
     * @param keyType The type of key pair. Note that ED25519 keys are not supported for Windows
     *   instances.
     */
    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    /**
     * The public key material.
     *
     * The `PublicKeyMaterial` property is used to import a key pair. If this property is not
     * specified, then a new key pair will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-publickeymaterial)
     *
     * @param publicKeyMaterial The public key material.
     */
    public fun publicKeyMaterial(publicKeyMaterial: String) {
        cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    /**
     * The tags to apply to the key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-tags)
     *
     * @param tags The tags to apply to the key pair.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to apply to the key pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-keypair.html#cfn-ec2-keypair-tags)
     *
     * @param tags The tags to apply to the key pair.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnKeyPair {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
