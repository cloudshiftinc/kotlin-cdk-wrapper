package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBProxyEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrDbProxyEndpointArn(): String = unwrap(this).getAttrDbProxyEndpointArn()

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun dbProxyEndpointName(): String = unwrap(this).getDbProxyEndpointName()

  public open fun dbProxyEndpointName(`value`: String) {
    unwrap(this).setDbProxyEndpointName(`value`)
  }

  public open fun dbProxyName(): String = unwrap(this).getDbProxyName()

  public open fun dbProxyName(`value`: String) {
    unwrap(this).setDbProxyName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<TagFormatProperty> =
      unwrap(this).getTags()?.map(TagFormatProperty::wrap) ?: emptyList()

  public open fun tags(`value`: List<TagFormatProperty>) {
    unwrap(this).setTags(`value`.map(TagFormatProperty::unwrap))
  }

  public open fun tags(vararg `value`: TagFormatProperty): Unit = tags(`value`.toList())

  public open fun targetRole(): String? = unwrap(this).getTargetRole()

  public open fun targetRole(`value`: String) {
    unwrap(this).setTargetRole(`value`)
  }

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  public open fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds()

  public open fun vpcSubnetIds(`value`: List<String>) {
    unwrap(this).setVpcSubnetIds(`value`)
  }

  public open fun vpcSubnetIds(vararg `value`: String): Unit = vpcSubnetIds(`value`.toList())

  public interface Builder {
    public fun dbProxyEndpointName(dbProxyEndpointName: String)

    public fun dbProxyName(dbProxyName: String)

    public fun tags(tags: List<TagFormatProperty>)

    public fun tags(vararg tags: TagFormatProperty)

    public fun targetRole(targetRole: String)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.Builder.create(scope, id)

    override fun dbProxyEndpointName(dbProxyEndpointName: String) {
      cdkBuilder.dbProxyEndpointName(dbProxyEndpointName)
    }

    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    override fun tags(tags: List<TagFormatProperty>) {
      cdkBuilder.tags(tags.map(TagFormatProperty::unwrap))
    }

    override fun tags(vararg tags: TagFormatProperty): Unit = tags(tags.toList())

    override fun targetRole(targetRole: String) {
      cdkBuilder.targetRole(targetRole)
    }

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyEndpoint = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBProxyEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBProxyEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint):
        CfnDBProxyEndpoint = CfnDBProxyEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyEndpoint):
        software.amazon.awscdk.services.rds.CfnDBProxyEndpoint = wrapped.cdkObject
  }

  public interface TagFormatProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty,
    ) : TagFormatProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty):
          TagFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
