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

package io.cloudshiftdev.awscdkdsl.services.kms

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.AliasAttributes
import software.amazon.awscdk.services.kms.AliasProps
import software.amazon.awscdk.services.kms.CfnAlias
import software.amazon.awscdk.services.kms.CfnAliasProps
import software.amazon.awscdk.services.kms.CfnKey
import software.amazon.awscdk.services.kms.CfnKeyProps
import software.amazon.awscdk.services.kms.CfnReplicaKey
import software.amazon.awscdk.services.kms.CfnReplicaKeyProps
import software.amazon.awscdk.services.kms.Key
import software.amazon.awscdk.services.kms.KeyLookupOptions
import software.amazon.awscdk.services.kms.KeyProps
import software.constructs.Construct

public object kms {
    /**
     * Defines a display name for a customer master key (CMK) in AWS Key Management Service (AWS
     * KMS).
     *
     * Using an alias to refer to a key can help you simplify key management. For example, when
     * rotating keys, you can just update the alias mapping instead of tracking and changing key
     * IDs. For more information, see Working with Aliases in the AWS Key Management Service
     * Developer Guide.
     *
     * You can also add an alias for a key by calling `key.addAlias(alias)`.
     *
     * Example:
     * ```
     * // Passing an encrypted replication bucket created in a different stack.
     * App app = new App();
     * Stack replicationStack = Stack.Builder.create(app, "ReplicationStack")
     * .env(Environment.builder()
     * .region("us-west-1")
     * .build())
     * .build();
     * Key key = new Key(replicationStack, "ReplicationKey");
     * Alias alias = Alias.Builder.create(replicationStack, "ReplicationAlias")
     * // aliasName is required
     * .aliasName(PhysicalName.GENERATE_IF_NEEDED)
     * .targetKey(key)
     * .build();
     * Bucket replicationBucket = Bucket.Builder.create(replicationStack, "ReplicationBucket")
     * .bucketName(PhysicalName.GENERATE_IF_NEEDED)
     * .encryptionKey(alias)
     * .build();
     * ```
     */
    public inline fun alias(
        scope: Construct,
        id: String,
        block: AliasDsl.() -> Unit = {},
    ): Alias {
        val builder = AliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a reference to an existing KMS Alias.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * Key key;
     * AliasAttributes aliasAttributes = AliasAttributes.builder()
     * .aliasName("aliasName")
     * .aliasTargetKey(key)
     * .build();
     * ```
     */
    public inline fun aliasAttributes(block: AliasAttributesDsl.() -> Unit = {}): AliasAttributes {
        val builder = AliasAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a KMS Key Alias object.
     *
     * Example:
     * ```
     * // Passing an encrypted replication bucket created in a different stack.
     * App app = new App();
     * Stack replicationStack = Stack.Builder.create(app, "ReplicationStack")
     * .env(Environment.builder()
     * .region("us-west-1")
     * .build())
     * .build();
     * Key key = new Key(replicationStack, "ReplicationKey");
     * Alias alias = Alias.Builder.create(replicationStack, "ReplicationAlias")
     * // aliasName is required
     * .aliasName(PhysicalName.GENERATE_IF_NEEDED)
     * .targetKey(key)
     * .build();
     * Bucket replicationBucket = Bucket.Builder.create(replicationStack, "ReplicationBucket")
     * .bucketName(PhysicalName.GENERATE_IF_NEEDED)
     * .encryptionKey(alias)
     * .build();
     * ```
     */
    public inline fun aliasProps(block: AliasPropsDsl.() -> Unit = {}): AliasProps {
        val builder = AliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::KMS::Alias` resource specifies a display name for a
     * [KMS key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys) . You
     * can use an alias to identify a KMS key in the AWS KMS console, in the
     * [DescribeKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html)
     * operation, and in
     * [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations)
     * , such as [Decrypt](https://docs.aws.amazon.com/kms/latest/APIReference/API_Decrypt.html) and
     * [GenerateDataKey](https://docs.aws.amazon.com/kms/latest/APIReference/API_GenerateDataKey.html)
     * .
     *
     * Adding, deleting, or updating an alias can allow or deny permission to the KMS key. For
     * details, see
     * [ABAC for AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/abac.html) in the
     * *AWS Key Management Service Developer Guide* .
     *
     * Using an alias to refer to a KMS key can help you simplify key management. For example, an
     * alias in your code can be associated with different KMS keys in different AWS Regions . For
     * more information, see
     * [Using aliases](https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html) in the
     * *AWS Key Management Service Developer Guide* .
     *
     * When specifying an alias, observe the following rules.
     * * Each alias is associated with one KMS key, but multiple aliases can be associated with the
     *   same KMS key.
     * * The alias and its associated KMS key must be in the same AWS account and Region.
     * * The alias name must be unique in the AWS account and Region. However, you can create
     *   aliases with the same name in different AWS Regions . For example, you can have an
     *   `alias/projectKey` in multiple Regions, each of which is associated with a KMS key in its
     *   Region.
     * * Each alias name must begin with `alias/` followed by a name, such as `alias/exampleKey` .
     *   The alias name can contain only alphanumeric characters, forward slashes (/), underscores
     *   (_), and dashes (-). Alias names cannot begin with `alias/aws/` . That alias name prefix is
     *   reserved for
     *   [AWS managed keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
     *   .
     *
     * *Regions*
     *
     * AWS KMS CloudFormation resources are available in all AWS Regions in which AWS KMS and AWS
     * CloudFormation are supported.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * CfnAlias cfnAlias = CfnAlias.Builder.create(this, "MyCfnAlias")
     * .aliasName("aliasName")
     * .targetKeyId("targetKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html)
     */
    public inline fun cfnAlias(
        scope: Construct,
        id: String,
        block: CfnAliasDsl.() -> Unit = {},
    ): CfnAlias {
        val builder = CfnAliasDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAlias`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * CfnAliasProps cfnAliasProps = CfnAliasProps.builder()
     * .aliasName("aliasName")
     * .targetKeyId("targetKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-alias.html)
     */
    public inline fun cfnAliasProps(block: CfnAliasPropsDsl.() -> Unit = {}): CfnAliasProps {
        val builder = CfnAliasPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::KMS::Key` resource specifies an
     * [KMS key](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys) in
     * AWS Key Management Service . You can use this resource to create symmetric encryption KMS
     * keys, asymmetric KMS keys for encryption or signing, and symmetric HMAC KMS keys. You can use
     * `AWS::KMS::Key` to create
     * [multi-Region primary keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html#mrk-primary-key)
     * of all supported types. To replicate a multi-Region key, use the `AWS::KMS::ReplicaKey`
     * resource.
     *
     * If you change the value of the `KeySpec` , `KeyUsage` , or `MultiRegion` properties of an
     * existing KMS key, the update request fails, regardless of the value of the
     * [`UpdateReplacePolicy` attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * . This prevents you from accidentally deleting a KMS key by changing any of its immutable
     * property values. &gt; AWS KMS replaced the term *customer master key (CMK)* with *AWS KMS
     * key* and *KMS key* . The concept has not changed. To prevent breaking changes, AWS KMS is
     * keeping some variations of this term.
     *
     * You can use symmetric encryption KMS keys to encrypt and decrypt small amounts of data, but
     * they are more commonly used to generate data keys and data key pairs. You can also use a
     * symmetric encryption KMS key to encrypt data stored in AWS services that are
     * [integrated with AWS KMS](https://docs.aws.amazon.com//kms/features/#AWS_Service_Integration)
     * . For more information, see
     * [Symmetric encryption KMS keys](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * You can use asymmetric KMS keys to encrypt and decrypt data or sign messages and verify
     * signatures. To create an asymmetric key, you must specify an asymmetric `KeySpec` value and a
     * `KeyUsage` value. For details, see
     * [Asymmetric keys in AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * You can use HMAC KMS keys (which are also symmetric keys) to generate and verify hash-based
     * message authentication codes. To create an HMAC key, you must specify an HMAC `KeySpec` value
     * and a `KeyUsage` value of `GENERATE_VERIFY_MAC` . For details, see
     * [HMAC keys in AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html) in
     * the *AWS Key Management Service Developer Guide* .
     *
     * You can also create symmetric encryption, asymmetric, and HMAC multi-Region primary keys. To
     * create a multi-Region primary key, set the `MultiRegion` property to `true` . For information
     * about multi-Region keys, see
     * [Multi-Region keys in AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * You cannot use the `AWS::KMS::Key` resource to specify a KMS key with
     * [imported key material](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html)
     * or a KMS key in a
     * [custom key store](https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html)
     * .
     *
     * *Regions*
     *
     * AWS KMS CloudFormation resources are available in all Regions in which AWS KMS and AWS
     * CloudFormation are supported. You can use the `AWS::KMS::Key` resource to create and manage
     * all KMS key types that are supported in a Region.
     *
     * Example:
     * ```
     * CfnInclude cfnTemplate;
     * CfnKey cfnKey = (CfnKey)cfnTemplate.getResource("Key");
     * IKey key = Key.fromCfnKey(cfnKey);
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html)
     */
    public inline fun cfnKey(
        scope: Construct,
        id: String,
        block: CfnKeyDsl.() -> Unit = {},
    ): CfnKey {
        val builder = CfnKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * Object keyPolicy;
     * CfnKeyProps cfnKeyProps = CfnKeyProps.builder()
     * .bypassPolicyLockoutSafetyCheck(false)
     * .description("description")
     * .enabled(false)
     * .enableKeyRotation(false)
     * .keyPolicy(keyPolicy)
     * .keySpec("keySpec")
     * .keyUsage("keyUsage")
     * .multiRegion(false)
     * .origin("origin")
     * .pendingWindowInDays(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html)
     */
    public inline fun cfnKeyProps(block: CfnKeyPropsDsl.() -> Unit = {}): CfnKeyProps {
        val builder = CfnKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::KMS::ReplicaKey` resource specifies a multi-Region replica key that is based on a
     * multi-Region primary key.
     *
     * *Multi-Region keys* are an AWS KMS feature that lets you create multiple interoperable KMS
     * keys in different AWS Regions . Because these KMS keys have the same key ID, key material,
     * and other metadata, you can use them to encrypt data in one AWS Region and decrypt it in a
     * different AWS Region without making a cross-Region call or exposing the plaintext data. For
     * more information, see
     * [Multi-Region keys](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the *AWS Key Management Service Developer Guide* .
     *
     * A multi-Region *primary key* is a fully functional symmetric encryption KMS key, HMAC KMS
     * key, or asymmetric KMS key that is also the model for replica keys in other AWS Regions . To
     * create a multi-Region primary key, add an
     * [AWS::KMS::Key](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-key.html)
     * resource to your CloudFormation stack. Set its `MultiRegion` property to true.
     *
     * A multi-Region *replica key* is a fully functional KMS key that has the same key ID and key
     * material as a multi-Region primary key, but is located in a different AWS Region of the same
     * AWS partition. There can be multiple replicas of a primary key, but each must be in a
     * different AWS Region .
     *
     * When you create a replica key in AWS CloudFormation , the replica key is created in the AWS
     * Region represented by the endpoint you use for the request. If you try to replicate a
     * multi-Region key into a Region in which the key type is not supported, the request will fail.
     *
     * A primary key and its replicas have the same key ID and key material. They also have the same
     * key spec, key usage, key material origin, and automatic key rotation status. These properties
     * are known as *shared properties* . If they change, AWS KMS synchronizes the change to all
     * related multi-Region keys. All other properties of a replica key can differ, including its
     * key policy, tags, aliases, and key state. AWS KMS does not synchronize these properties.
     *
     * *Regions*
     *
     * AWS KMS CloudFormation resources are available in all AWS Regions in which AWS KMS and AWS
     * CloudFormation are supported. You can use the `AWS::KMS::ReplicaKey` resource to create
     * replica keys in all Regions that support multi-Region KMS keys. For details, see
     * [Multi-Region keys in AWS KMS](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html)
     * in the ** .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * Object keyPolicy;
     * CfnReplicaKey cfnReplicaKey = CfnReplicaKey.Builder.create(this, "MyCfnReplicaKey")
     * .keyPolicy(keyPolicy)
     * .primaryKeyArn("primaryKeyArn")
     * // the properties below are optional
     * .description("description")
     * .enabled(false)
     * .pendingWindowInDays(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html)
     */
    public inline fun cfnReplicaKey(
        scope: Construct,
        id: String,
        block: CfnReplicaKeyDsl.() -> Unit = {},
    ): CfnReplicaKey {
        val builder = CfnReplicaKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnReplicaKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kms.*;
     * Object keyPolicy;
     * CfnReplicaKeyProps cfnReplicaKeyProps = CfnReplicaKeyProps.builder()
     * .keyPolicy(keyPolicy)
     * .primaryKeyArn("primaryKeyArn")
     * // the properties below are optional
     * .description("description")
     * .enabled(false)
     * .pendingWindowInDays(123)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kms-replicakey.html)
     */
    public inline fun cfnReplicaKeyProps(
        block: CfnReplicaKeyPropsDsl.() -> Unit = {}
    ): CfnReplicaKeyProps {
        val builder = CfnReplicaKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a KMS key.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.kms.*;
     * Key encryptionKey = Key.Builder.create(this, "Key")
     * .enableKeyRotation(true)
     * .build();
     * Table table = Table.Builder.create(this, "MyTable")
     * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
     * .encryption(TableEncryption.CUSTOMER_MANAGED)
     * .encryptionKey(encryptionKey)
     * .build();
     * ```
     */
    public inline fun key(
        scope: Construct,
        id: String,
        block: KeyDsl.() -> Unit = {},
    ): Key {
        val builder = KeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for looking up an existing Key.
     *
     * Example:
     * ```
     * IKey myKeyLookup = Key.fromLookup(this, "MyKeyLookup", KeyLookupOptions.builder()
     * .aliasName("alias/KeyAlias")
     * .build());
     * Role role = Role.Builder.create(this, "MyRole")
     * .assumedBy(new ServicePrincipal("lambda.amazonaws.com"))
     * .build();
     * myKeyLookup.grantEncryptDecrypt(role);
     * ```
     */
    public inline fun keyLookupOptions(
        block: KeyLookupOptionsDsl.() -> Unit = {}
    ): KeyLookupOptions {
        val builder = KeyLookupOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a KMS Key object.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.kms.*;
     * Artifact sourceOutput = new Artifact();
     * Bucket targetBucket = new Bucket(this, "MyBucket");
     * IKey key = Key.Builder.create(this, "EnvVarEncryptKey")
     * .description("sample key")
     * .build();
     * Pipeline pipeline = new Pipeline(this, "MyPipeline");
     * S3DeployAction deployAction = S3DeployAction.Builder.create()
     * .actionName("S3Deploy")
     * .bucket(targetBucket)
     * .input(sourceOutput)
     * .encryptionKey(key)
     * .build();
     * IStage deployStage = pipeline.addStage(StageOptions.builder()
     * .stageName("Deploy")
     * .actions(List.of(deployAction))
     * .build());
     * ```
     */
    public inline fun keyProps(block: KeyPropsDsl.() -> Unit = {}): KeyProps {
        val builder = KeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
