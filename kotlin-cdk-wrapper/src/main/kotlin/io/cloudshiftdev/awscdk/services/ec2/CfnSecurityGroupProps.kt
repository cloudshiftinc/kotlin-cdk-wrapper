@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSecurityGroupProps {
  public fun groupDescription(): String

  public fun groupName(): String? = unwrap(this).getGroupName()

  public fun securityGroupEgress(): Any? = unwrap(this).getSecurityGroupEgress()

  public fun securityGroupIngress(): Any? = unwrap(this).getSecurityGroupIngress()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  @CdkDslMarker
  public interface Builder {
    public fun groupDescription(groupDescription: String)

    public fun groupName(groupName: String)

    public fun securityGroupEgress(securityGroupEgress: IResolvable)

    public fun securityGroupEgress(securityGroupEgress: List<Any>)

    public fun securityGroupEgress(vararg securityGroupEgress: Any)

    public fun securityGroupIngress(securityGroupIngress: IResolvable)

    public fun securityGroupIngress(securityGroupIngress: List<Any>)

    public fun securityGroupIngress(vararg securityGroupIngress: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupProps.builder()

    override fun groupDescription(groupDescription: String) {
      cdkBuilder.groupDescription(groupDescription)
    }

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun securityGroupEgress(securityGroupEgress: IResolvable) {
      cdkBuilder.securityGroupEgress(securityGroupEgress.let(IResolvable::unwrap))
    }

    override fun securityGroupEgress(securityGroupEgress: List<Any>) {
      cdkBuilder.securityGroupEgress(securityGroupEgress)
    }

    override fun securityGroupEgress(vararg securityGroupEgress: Any): Unit =
        securityGroupEgress(securityGroupEgress.toList())

    override fun securityGroupIngress(securityGroupIngress: IResolvable) {
      cdkBuilder.securityGroupIngress(securityGroupIngress.let(IResolvable::unwrap))
    }

    override fun securityGroupIngress(securityGroupIngress: List<Any>) {
      cdkBuilder.securityGroupIngress(securityGroupIngress)
    }

    override fun securityGroupIngress(vararg securityGroupIngress: Any): Unit =
        securityGroupIngress(securityGroupIngress.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupProps,
  ) : CdkObject(cdkObject), CfnSecurityGroupProps {
    override fun groupDescription(): String = unwrap(this).getGroupDescription()

    override fun groupName(): String? = unwrap(this).getGroupName()

    override fun securityGroupEgress(): Any? = unwrap(this).getSecurityGroupEgress()

    override fun securityGroupIngress(): Any? = unwrap(this).getSecurityGroupIngress()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupProps):
        CfnSecurityGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupProps):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnSecurityGroupProps
  }
}
