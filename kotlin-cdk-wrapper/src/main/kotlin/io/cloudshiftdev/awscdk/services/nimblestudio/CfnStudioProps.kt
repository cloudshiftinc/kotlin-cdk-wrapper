@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnStudioProps {
  public fun adminRoleArn(): String

  public fun displayName(): String

  public fun studioEncryptionConfiguration(): Any? = unwrap(this).getStudioEncryptionConfiguration()

  public fun studioName(): String

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun userRoleArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun adminRoleArn(adminRoleArn: String)

    public fun displayName(displayName: String)

    public fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable)

    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7caf0fa4ac0667612130fefd40540c448a4f6784c9ff61c8ead116516175e58")
    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty.Builder.() -> Unit)

    public fun studioName(studioName: String)

    public fun tags(tags: Map<String, String>)

    public fun userRoleArn(userRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnStudioProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStudioProps.builder()

    override fun adminRoleArn(adminRoleArn: String) {
      cdkBuilder.adminRoleArn(adminRoleArn)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(CfnStudio.StudioEncryptionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7caf0fa4ac0667612130fefd40540c448a4f6784c9ff61c8ead116516175e58")
    override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        studioEncryptionConfiguration(CfnStudio.StudioEncryptionConfigurationProperty(studioEncryptionConfiguration))

    override fun studioName(studioName: String) {
      cdkBuilder.studioName(studioName)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun userRoleArn(userRoleArn: String) {
      cdkBuilder.userRoleArn(userRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudioProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioProps,
  ) : CdkObject(cdkObject), CfnStudioProps {
    override fun adminRoleArn(): String = unwrap(this).getAdminRoleArn()

    override fun displayName(): String = unwrap(this).getDisplayName()

    override fun studioEncryptionConfiguration(): Any? =
        unwrap(this).getStudioEncryptionConfiguration()

    override fun studioName(): String = unwrap(this).getStudioName()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun userRoleArn(): String = unwrap(this).getUserRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioProps):
        CfnStudioProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioProps):
        software.amazon.awscdk.services.nimblestudio.CfnStudioProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnStudioProps
  }
}
