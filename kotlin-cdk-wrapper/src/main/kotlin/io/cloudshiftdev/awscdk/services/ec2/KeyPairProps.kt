@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.ResourceProps
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface KeyPairProps : ResourceProps {
  public fun format(): KeyPairFormat? = unwrap(this).getFormat()?.let(KeyPairFormat::wrap)

  public fun keyPairName(): String? = unwrap(this).getKeyPairName()

  public fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  public fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun environmentFromArn(environmentFromArn: String)

    public fun format(format: KeyPairFormat)

    public fun keyPairName(keyPairName: String)

    public fun physicalName(physicalName: String)

    public fun publicKeyMaterial(publicKeyMaterial: String)

    public fun region(region: String)

    public fun type(type: KeyPairType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.KeyPairProps.Builder =
        software.amazon.awscdk.services.ec2.KeyPairProps.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun environmentFromArn(environmentFromArn: String) {
      cdkBuilder.environmentFromArn(environmentFromArn)
    }

    override fun format(format: KeyPairFormat) {
      cdkBuilder.format(format.let(KeyPairFormat::unwrap))
    }

    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    override fun physicalName(physicalName: String) {
      cdkBuilder.physicalName(physicalName)
    }

    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun type(type: KeyPairType) {
      cdkBuilder.type(type.let(KeyPairType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.KeyPairProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.KeyPairProps,
  ) : CdkObject(cdkObject), KeyPairProps {
    override fun account(): String? = unwrap(this).getAccount()

    override fun environmentFromArn(): String? = unwrap(this).getEnvironmentFromArn()

    override fun format(): KeyPairFormat? = unwrap(this).getFormat()?.let(KeyPairFormat::wrap)

    override fun keyPairName(): String? = unwrap(this).getKeyPairName()

    override fun physicalName(): String? = unwrap(this).getPhysicalName()

    override fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

    override fun region(): String? = unwrap(this).getRegion()

    override fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyPairProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPairProps): KeyPairProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyPairProps): software.amazon.awscdk.services.ec2.KeyPairProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.KeyPairProps
  }
}
