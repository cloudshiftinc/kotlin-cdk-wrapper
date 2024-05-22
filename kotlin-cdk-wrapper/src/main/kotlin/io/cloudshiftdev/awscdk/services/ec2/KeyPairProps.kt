@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.ResourceProps
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The properties of a Key Pair.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * KeyPair keyPair = KeyPair.Builder.create(this, "KeyPair")
 * .type(KeyPairType.ED25519)
 * .format(KeyPairFormat.PEM)
 * .build();
 * Instance instance = Instance.Builder.create(this, "Instance")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(MachineImage.latestAmazonLinux2023())
 * // Use the custom key pair
 * .keyPair(keyPair)
 * .build();
 * ```
 */
public interface KeyPairProps : ResourceProps {
  /**
   * The format of the key pair.
   *
   * Default: PEM
   */
  public fun format(): KeyPairFormat? = unwrap(this).getFormat()?.let(KeyPairFormat::wrap)

  /**
   * A unique name for the key pair.
   *
   * Default: A generated name
   */
  public fun keyPairName(): String? = unwrap(this).getKeyPairName()

  /**
   * The public key material.
   *
   * If this is provided the key is considered "imported". For imported
   * keys, it is assumed that you already have the private key material
   * so the private key material will not be returned or stored in
   * AWS Systems Manager Parameter Store.
   *
   * Default: a public and private key will be generated
   */
  public fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  /**
   * The type of key pair.
   *
   * Default: RSA (ignored if keyMaterial is provided)
   */
  public fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  /**
   * A builder for [KeyPairProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The AWS account ID this resource belongs to.
     */
    public fun account(account: String)

    /**
     * @param environmentFromArn ARN to deduce region and account from.
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     */
    public fun environmentFromArn(environmentFromArn: String)

    /**
     * @param format The format of the key pair.
     */
    public fun format(format: KeyPairFormat)

    /**
     * @param keyPairName A unique name for the key pair.
     */
    public fun keyPairName(keyPairName: String)

    /**
     * @param physicalName The value passed in by users to the physical name prop of the resource.
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     */
    public fun physicalName(physicalName: String)

    /**
     * @param publicKeyMaterial The public key material.
     * If this is provided the key is considered "imported". For imported
     * keys, it is assumed that you already have the private key material
     * so the private key material will not be returned or stored in
     * AWS Systems Manager Parameter Store.
     */
    public fun publicKeyMaterial(publicKeyMaterial: String)

    /**
     * @param region The AWS region this resource belongs to.
     */
    public fun region(region: String)

    /**
     * @param type The type of key pair.
     */
    public fun type(type: KeyPairType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.KeyPairProps.Builder =
        software.amazon.awscdk.services.ec2.KeyPairProps.builder()

    /**
     * @param account The AWS account ID this resource belongs to.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param environmentFromArn ARN to deduce region and account from.
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     */
    override fun environmentFromArn(environmentFromArn: String) {
      cdkBuilder.environmentFromArn(environmentFromArn)
    }

    /**
     * @param format The format of the key pair.
     */
    override fun format(format: KeyPairFormat) {
      cdkBuilder.format(format.let(KeyPairFormat.Companion::unwrap))
    }

    /**
     * @param keyPairName A unique name for the key pair.
     */
    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    /**
     * @param physicalName The value passed in by users to the physical name prop of the resource.
     * * `undefined` implies that a physical name will be allocated by
     * CloudFormation during deployment.
     * * a concrete value implies a specific physical name
     * * `PhysicalName.GENERATE_IF_NEEDED` is a marker that indicates that a physical will only be
     * generated
     * by the CDK if it is needed for cross-environment references. Otherwise, it will be allocated
     * by CloudFormation.
     */
    override fun physicalName(physicalName: String) {
      cdkBuilder.physicalName(physicalName)
    }

    /**
     * @param publicKeyMaterial The public key material.
     * If this is provided the key is considered "imported". For imported
     * keys, it is assumed that you already have the private key material
     * so the private key material will not be returned or stored in
     * AWS Systems Manager Parameter Store.
     */
    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    /**
     * @param region The AWS region this resource belongs to.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param type The type of key pair.
     */
    override fun type(type: KeyPairType) {
      cdkBuilder.type(type.let(KeyPairType.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.KeyPairProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.KeyPairProps,
  ) : CdkObject(cdkObject), KeyPairProps {
    /**
     * The AWS account ID this resource belongs to.
     *
     * Default: - the resource is in the same account as the stack it belongs to
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * ARN to deduce region and account from.
     *
     * The ARN is parsed and the account and region are taken from the ARN.
     * This should be used for imported resources.
     *
     * Cannot be supplied together with either `account` or `region`.
     *
     * Default: - take environment from `account`, `region` parameters, or use Stack environment.
     */
    override fun environmentFromArn(): String? = unwrap(this).getEnvironmentFromArn()

    /**
     * The format of the key pair.
     *
     * Default: PEM
     */
    override fun format(): KeyPairFormat? = unwrap(this).getFormat()?.let(KeyPairFormat::wrap)

    /**
     * A unique name for the key pair.
     *
     * Default: A generated name
     */
    override fun keyPairName(): String? = unwrap(this).getKeyPairName()

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
     */
    override fun physicalName(): String? = unwrap(this).getPhysicalName()

    /**
     * The public key material.
     *
     * If this is provided the key is considered "imported". For imported
     * keys, it is assumed that you already have the private key material
     * so the private key material will not be returned or stored in
     * AWS Systems Manager Parameter Store.
     *
     * Default: a public and private key will be generated
     */
    override fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

    /**
     * The AWS region this resource belongs to.
     *
     * Default: - the resource is in the same region as the stack it belongs to
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * The type of key pair.
     *
     * Default: RSA (ignored if keyMaterial is provided)
     */
    override fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyPairProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPairProps): KeyPairProps =
        CdkObjectWrappers.wrap(cdkObject) as? KeyPairProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyPairProps): software.amazon.awscdk.services.ec2.KeyPairProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.KeyPairProps
  }
}
