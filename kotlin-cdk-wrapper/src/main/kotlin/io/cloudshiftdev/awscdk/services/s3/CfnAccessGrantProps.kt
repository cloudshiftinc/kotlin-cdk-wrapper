@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAccessGrantProps {
  public fun accessGrantsLocationConfiguration(): Any? =
      unwrap(this).getAccessGrantsLocationConfiguration()

  public fun accessGrantsLocationId(): String

  public fun applicationArn(): String? = unwrap(this).getApplicationArn()

  public fun grantee(): Any

  public fun permission(): String

  public fun s3PrefixType(): String? = unwrap(this).getS3PrefixType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable)

    public
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd059e0b4fb3783f866b1cf0ca58b0c731c6a956c6cd48e350106313d2653358")
    public
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty.Builder.() -> Unit)

    public fun accessGrantsLocationId(accessGrantsLocationId: String)

    public fun applicationArn(applicationArn: String)

    public fun grantee(grantee: IResolvable)

    public fun grantee(grantee: CfnAccessGrant.GranteeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60603d92d1f778945c90968dbdc5c0ed893d51faeccfbe210f3effdb0f4ed68e")
    public fun grantee(grantee: CfnAccessGrant.GranteeProperty.Builder.() -> Unit)

    public fun permission(permission: String)

    public fun s3PrefixType(s3PrefixType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnAccessGrantProps.Builder =
        software.amazon.awscdk.services.s3.CfnAccessGrantProps.builder()

    override fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable) {
      cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty) {
      cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration.let(CfnAccessGrant.AccessGrantsLocationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd059e0b4fb3783f866b1cf0ca58b0c731c6a956c6cd48e350106313d2653358")
    override
        fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty.Builder.() -> Unit):
        Unit =
        accessGrantsLocationConfiguration(CfnAccessGrant.AccessGrantsLocationConfigurationProperty(accessGrantsLocationConfiguration))

    override fun accessGrantsLocationId(accessGrantsLocationId: String) {
      cdkBuilder.accessGrantsLocationId(accessGrantsLocationId)
    }

    override fun applicationArn(applicationArn: String) {
      cdkBuilder.applicationArn(applicationArn)
    }

    override fun grantee(grantee: IResolvable) {
      cdkBuilder.grantee(grantee.let(IResolvable::unwrap))
    }

    override fun grantee(grantee: CfnAccessGrant.GranteeProperty) {
      cdkBuilder.grantee(grantee.let(CfnAccessGrant.GranteeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60603d92d1f778945c90968dbdc5c0ed893d51faeccfbe210f3effdb0f4ed68e")
    override fun grantee(grantee: CfnAccessGrant.GranteeProperty.Builder.() -> Unit): Unit =
        grantee(CfnAccessGrant.GranteeProperty(grantee))

    override fun permission(permission: String) {
      cdkBuilder.permission(permission)
    }

    override fun s3PrefixType(s3PrefixType: String) {
      cdkBuilder.s3PrefixType(s3PrefixType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnAccessGrantProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantProps,
  ) : CdkObject(cdkObject), CfnAccessGrantProps {
    override fun accessGrantsLocationConfiguration(): Any? =
        unwrap(this).getAccessGrantsLocationConfiguration()

    override fun accessGrantsLocationId(): String = unwrap(this).getAccessGrantsLocationId()

    override fun applicationArn(): String? = unwrap(this).getApplicationArn()

    override fun grantee(): Any = unwrap(this).getGrantee()

    override fun permission(): String = unwrap(this).getPermission()

    override fun s3PrefixType(): String? = unwrap(this).getS3PrefixType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessGrantProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnAccessGrantProps):
        CfnAccessGrantProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessGrantProps):
        software.amazon.awscdk.services.s3.CfnAccessGrantProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.CfnAccessGrantProps
  }
}
