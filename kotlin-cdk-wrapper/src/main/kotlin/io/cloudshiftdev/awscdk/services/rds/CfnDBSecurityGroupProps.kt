@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDBSecurityGroupProps {
  public fun dbSecurityGroupIngress(): Any

  public fun ec2VpcId(): String? = unwrap(this).getEc2VpcId()

  public fun groupDescription(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable)

    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>)

    public fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any)

    public fun ec2VpcId(ec2VpcId: String)

    public fun groupDescription(groupDescription: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps.builder()

    override fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable) {
      cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress.let(IResolvable::unwrap))
    }

    override fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>) {
      cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress)
    }

    override fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any): Unit =
        dbSecurityGroupIngress(dbSecurityGroupIngress.toList())

    override fun ec2VpcId(ec2VpcId: String) {
      cdkBuilder.ec2VpcId(ec2VpcId)
    }

    override fun groupDescription(groupDescription: String) {
      cdkBuilder.groupDescription(groupDescription)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps,
  ) : CdkObject(cdkObject), CfnDBSecurityGroupProps {
    override fun dbSecurityGroupIngress(): Any = unwrap(this).getDbSecurityGroupIngress()

    override fun ec2VpcId(): String? = unwrap(this).getEc2VpcId()

    override fun groupDescription(): String = unwrap(this).getGroupDescription()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBSecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps):
        CfnDBSecurityGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBSecurityGroupProps):
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps
  }
}
