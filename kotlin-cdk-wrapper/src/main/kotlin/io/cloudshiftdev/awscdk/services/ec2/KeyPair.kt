@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ssm.IStringParameter
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An EC2 Key Pair.
 *
 * Example:
 *
 * ```
 * IKeyPair keyPair = KeyPair.fromKeyPairAttributes(this, "KeyPair", KeyPairAttributes.builder()
 * .keyPairName("the-keypair-name")
 * .type(KeyPairType.RSA)
 * .build());
 * ```
 */
public open class KeyPair internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.KeyPair,
) : Resource(cdkObject), IKeyPair {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.KeyPair(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeyPairProps,
  ) :
      this(software.amazon.awscdk.services.ec2.KeyPair(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(KeyPairProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeyPairProps.Builder.() -> Unit,
  ) : this(scope, id, KeyPairProps(props)
  )

  /**
   * The format of the key pair.
   */
  public open fun format(): KeyPairFormat = unwrap(this).getFormat().let(KeyPairFormat::wrap)

  /**
   * Whether the key material was imported.
   *
   * Keys with imported material do not have their private key material stored
   * or returned automatically.
   */
  public open fun hasImportedMaterial(): Boolean = unwrap(this).getHasImportedMaterial()

  /**
   * The fingerprint of the key pair.
   */
  public open fun keyPairFingerprint(): String = unwrap(this).getKeyPairFingerprint()

  /**
   * The unique ID of the key pair.
   */
  public open fun keyPairId(): String = unwrap(this).getKeyPairId()

  /**
   * The unique name of the key pair.
   */
  public override fun keyPairName(): String = unwrap(this).getKeyPairName()

  /**
   * The Systems Manager Parameter Store parameter with the pair's private key material.
   */
  public open fun privateKey(): IStringParameter =
      unwrap(this).getPrivateKey().let(IStringParameter::wrap)

  /**
   * The type of the key pair.
   */
  public override fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.KeyPair].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID this resource belongs to.
     *
     * Default: - the resource is in the same account as the stack it belongs to
     *
     * @param account The AWS account ID this resource belongs to. 
     */
    public fun account(account: String)

    /**
     * ARN to deduce region and account from.
     *
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     *
     * Default: - take environment from `account`, `region` parameters, or use Stack environment.
     *
     * @param environmentFromArn ARN to deduce region and account from. 
     */
    public fun environmentFromArn(environmentFromArn: String)

    /**
     * The format of the key pair.
     *
     * Default: PEM
     *
     * @param format The format of the key pair. 
     */
    public fun format(format: KeyPairFormat)

    /**
     * A unique name for the key pair.
     *
     * Default: A generated name
     *
     * @param keyPairName A unique name for the key pair. 
     */
    public fun keyPairName(keyPairName: String)

    /**
     * The value passed in by users to the physical name prop of the resource.
     *
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     *
     * Default: - The physical name will be allocated by CloudFormation at deployment time
     *
     * @param physicalName The value passed in by users to the physical name prop of the resource. 
     */
    public fun physicalName(physicalName: String)

    /**
     * The public key material.
     *
     * If this is provided the key is considered "imported". For imported
     * keys, it is assumed that you already have the private key material
     * so the private key material will not be returned or stored in
     * AWS Systems Manager Parameter Store.
     *
     * Default: a public and private key will be generated
     *
     * @param publicKeyMaterial The public key material. 
     */
    public fun publicKeyMaterial(publicKeyMaterial: String)

    /**
     * The AWS region this resource belongs to.
     *
     * Default: - the resource is in the same region as the stack it belongs to
     *
     * @param region The AWS region this resource belongs to. 
     */
    public fun region(region: String)

    /**
     * The type of key pair.
     *
     * Default: RSA (ignored if keyMaterial is provided)
     *
     * @param type The type of key pair. 
     */
    public fun type(type: KeyPairType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.KeyPair.Builder =
        software.amazon.awscdk.services.ec2.KeyPair.Builder.create(scope, id)

    /**
     * The AWS account ID this resource belongs to.
     *
     * Default: - the resource is in the same account as the stack it belongs to
     *
     * @param account The AWS account ID this resource belongs to. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * ARN to deduce region and account from.
     *
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     *
     * Default: - take environment from `account`, `region` parameters, or use Stack environment.
     *
     * @param environmentFromArn ARN to deduce region and account from. 
     */
    override fun environmentFromArn(environmentFromArn: String) {
      cdkBuilder.environmentFromArn(environmentFromArn)
    }

    /**
     * The format of the key pair.
     *
     * Default: PEM
     *
     * @param format The format of the key pair. 
     */
    override fun format(format: KeyPairFormat) {
      cdkBuilder.format(format.let(KeyPairFormat::unwrap))
    }

    /**
     * A unique name for the key pair.
     *
     * Default: A generated name
     *
     * @param keyPairName A unique name for the key pair. 
     */
    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    /**
     * The value passed in by users to the physical name prop of the resource.
     *
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     *
     * Default: - The physical name will be allocated by CloudFormation at deployment time
     *
     * @param physicalName The value passed in by users to the physical name prop of the resource. 
     */
    override fun physicalName(physicalName: String) {
      cdkBuilder.physicalName(physicalName)
    }

    /**
     * The public key material.
     *
     * If this is provided the key is considered "imported". For imported
     * keys, it is assumed that you already have the private key material
     * so the private key material will not be returned or stored in
     * AWS Systems Manager Parameter Store.
     *
     * Default: a public and private key will be generated
     *
     * @param publicKeyMaterial The public key material. 
     */
    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    /**
     * The AWS region this resource belongs to.
     *
     * Default: - the resource is in the same region as the stack it belongs to
     *
     * @param region The AWS region this resource belongs to. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * The type of key pair.
     *
     * Default: RSA (ignored if keyMaterial is provided)
     *
     * @param type The type of key pair. 
     */
    override fun type(type: KeyPairType) {
      cdkBuilder.type(type.let(KeyPairType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.KeyPair = cdkBuilder.build()
  }

  public companion object {
    public fun fromKeyPairAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: KeyPairAttributes,
    ): IKeyPair =
        software.amazon.awscdk.services.ec2.KeyPair.fromKeyPairAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(KeyPairAttributes::unwrap)).let(IKeyPair::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd9caf7b1f832116a7bd6fe64c987b52581abb0163ff41ed36b0abc60e006127")
    public fun fromKeyPairAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: KeyPairAttributes.Builder.() -> Unit,
    ): IKeyPair = fromKeyPairAttributes(scope, id, KeyPairAttributes(attrs))

    public fun fromKeyPairName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      keyPairName: String,
    ): IKeyPair =
        software.amazon.awscdk.services.ec2.KeyPair.fromKeyPairName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, keyPairName).let(IKeyPair::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KeyPair {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KeyPair(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPair): KeyPair =
        KeyPair(cdkObject)

    internal fun unwrap(wrapped: KeyPair): software.amazon.awscdk.services.ec2.KeyPair =
        wrapped.cdkObject
  }
}
