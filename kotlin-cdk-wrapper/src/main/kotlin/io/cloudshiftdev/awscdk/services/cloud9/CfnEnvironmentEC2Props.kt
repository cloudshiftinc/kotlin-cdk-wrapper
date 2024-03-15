@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloud9

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEnvironmentEC2Props {
  public fun automaticStopTimeMinutes(): Number? = unwrap(this).getAutomaticStopTimeMinutes()

  public fun connectionType(): String? = unwrap(this).getConnectionType()

  public fun description(): String? = unwrap(this).getDescription()

  public fun imageId(): String

  public fun instanceType(): String

  public fun name(): String? = unwrap(this).getName()

  public fun ownerArn(): String? = unwrap(this).getOwnerArn()

  public fun repositories(): Any? = unwrap(this).getRepositories()

  public fun subnetId(): String? = unwrap(this).getSubnetId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number)

    public fun connectionType(connectionType: String)

    public fun description(description: String)

    public fun imageId(imageId: String)

    public fun instanceType(instanceType: String)

    public fun name(name: String)

    public fun ownerArn(ownerArn: String)

    public fun repositories(repositories: IResolvable)

    public fun repositories(repositories: List<Any>)

    public fun repositories(vararg repositories: Any)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.Builder =
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props.builder()

    override fun automaticStopTimeMinutes(automaticStopTimeMinutes: Number) {
      cdkBuilder.automaticStopTimeMinutes(automaticStopTimeMinutes)
    }

    override fun connectionType(connectionType: String) {
      cdkBuilder.connectionType(connectionType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ownerArn(ownerArn: String) {
      cdkBuilder.ownerArn(ownerArn)
    }

    override fun repositories(repositories: IResolvable) {
      cdkBuilder.repositories(repositories.let(IResolvable::unwrap))
    }

    override fun repositories(repositories: List<Any>) {
      cdkBuilder.repositories(repositories)
    }

    override fun repositories(vararg repositories: Any): Unit = repositories(repositories.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props,
  ) : CdkObject(cdkObject), CfnEnvironmentEC2Props {
    override fun automaticStopTimeMinutes(): Number? = unwrap(this).getAutomaticStopTimeMinutes()

    override fun connectionType(): String? = unwrap(this).getConnectionType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun imageId(): String = unwrap(this).getImageId()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun name(): String? = unwrap(this).getName()

    override fun ownerArn(): String? = unwrap(this).getOwnerArn()

    override fun repositories(): Any? = unwrap(this).getRepositories()

    override fun subnetId(): String? = unwrap(this).getSubnetId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentEC2Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props):
        CfnEnvironmentEC2Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentEC2Props):
        software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2Props
  }
}
