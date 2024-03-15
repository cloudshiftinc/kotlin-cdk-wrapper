@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnUserProps {
  public fun directoryUserId(): String? = unwrap(this).getDirectoryUserId()

  public fun hierarchyGroupArn(): String? = unwrap(this).getHierarchyGroupArn()

  public fun identityInfo(): Any? = unwrap(this).getIdentityInfo()

  public fun instanceArn(): String

  public fun password(): String? = unwrap(this).getPassword()

  public fun phoneConfig(): Any

  public fun routingProfileArn(): String

  public fun securityProfileArns(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userProficiencies(): Any? = unwrap(this).getUserProficiencies()

  public fun username(): String

  @CdkDslMarker
  public interface Builder {
    public fun directoryUserId(directoryUserId: String)

    public fun hierarchyGroupArn(hierarchyGroupArn: String)

    public fun identityInfo(identityInfo: IResolvable)

    public fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27e90f37bc2ca0ab7d545f7d7481a8e8c35d5f8ac7f1eeb8bf4ebbd1c216d75e")
    public fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty.Builder.() -> Unit)

    public fun instanceArn(instanceArn: String)

    public fun password(password: String)

    public fun phoneConfig(phoneConfig: IResolvable)

    public fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ba4e8b1576f1f8aad074c03a08c3ec019f329c14a2b857515a981dae2d2d618")
    public fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty.Builder.() -> Unit)

    public fun routingProfileArn(routingProfileArn: String)

    public fun securityProfileArns(securityProfileArns: List<String>)

    public fun securityProfileArns(vararg securityProfileArns: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userProficiencies(userProficiencies: IResolvable)

    public fun userProficiencies(userProficiencies: List<Any>)

    public fun userProficiencies(vararg userProficiencies: Any)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnUserProps.Builder =
        software.amazon.awscdk.services.connect.CfnUserProps.builder()

    override fun directoryUserId(directoryUserId: String) {
      cdkBuilder.directoryUserId(directoryUserId)
    }

    override fun hierarchyGroupArn(hierarchyGroupArn: String) {
      cdkBuilder.hierarchyGroupArn(hierarchyGroupArn)
    }

    override fun identityInfo(identityInfo: IResolvable) {
      cdkBuilder.identityInfo(identityInfo.let(IResolvable::unwrap))
    }

    override fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty) {
      cdkBuilder.identityInfo(identityInfo.let(CfnUser.UserIdentityInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27e90f37bc2ca0ab7d545f7d7481a8e8c35d5f8ac7f1eeb8bf4ebbd1c216d75e")
    override fun identityInfo(identityInfo: CfnUser.UserIdentityInfoProperty.Builder.() -> Unit):
        Unit = identityInfo(CfnUser.UserIdentityInfoProperty(identityInfo))

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    override fun phoneConfig(phoneConfig: IResolvable) {
      cdkBuilder.phoneConfig(phoneConfig.let(IResolvable::unwrap))
    }

    override fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty) {
      cdkBuilder.phoneConfig(phoneConfig.let(CfnUser.UserPhoneConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ba4e8b1576f1f8aad074c03a08c3ec019f329c14a2b857515a981dae2d2d618")
    override fun phoneConfig(phoneConfig: CfnUser.UserPhoneConfigProperty.Builder.() -> Unit): Unit
        = phoneConfig(CfnUser.UserPhoneConfigProperty(phoneConfig))

    override fun routingProfileArn(routingProfileArn: String) {
      cdkBuilder.routingProfileArn(routingProfileArn)
    }

    override fun securityProfileArns(securityProfileArns: List<String>) {
      cdkBuilder.securityProfileArns(securityProfileArns)
    }

    override fun securityProfileArns(vararg securityProfileArns: String): Unit =
        securityProfileArns(securityProfileArns.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userProficiencies(userProficiencies: IResolvable) {
      cdkBuilder.userProficiencies(userProficiencies.let(IResolvable::unwrap))
    }

    override fun userProficiencies(userProficiencies: List<Any>) {
      cdkBuilder.userProficiencies(userProficiencies)
    }

    override fun userProficiencies(vararg userProficiencies: Any): Unit =
        userProficiencies(userProficiencies.toList())

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    override fun directoryUserId(): String? = unwrap(this).getDirectoryUserId()

    override fun hierarchyGroupArn(): String? = unwrap(this).getHierarchyGroupArn()

    override fun identityInfo(): Any? = unwrap(this).getIdentityInfo()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun password(): String? = unwrap(this).getPassword()

    override fun phoneConfig(): Any = unwrap(this).getPhoneConfig()

    override fun routingProfileArn(): String = unwrap(this).getRoutingProfileArn()

    override fun securityProfileArns(): List<String> = unwrap(this).getSecurityProfileArns()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userProficiencies(): Any? = unwrap(this).getUserProficiencies()

    override fun username(): String = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserProps): CfnUserProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps): software.amazon.awscdk.services.connect.CfnUserProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnUserProps
  }
}
