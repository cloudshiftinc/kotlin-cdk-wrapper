@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEnvironmentProfileProps {
  public fun awsAccountId(): String

  public fun awsAccountRegion(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun domainIdentifier(): String

  public fun environmentBlueprintIdentifier(): String

  public fun name(): String

  public fun projectIdentifier(): String

  public fun userParameters(): Any? = unwrap(this).getUserParameters()

  @CdkDslMarker
  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun awsAccountRegion(awsAccountRegion: String)

    public fun description(description: String)

    public fun domainIdentifier(domainIdentifier: String)

    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String)

    public fun name(name: String)

    public fun projectIdentifier(projectIdentifier: String)

    public fun userParameters(userParameters: IResolvable)

    public fun userParameters(userParameters: List<Any>)

    public fun userParameters(vararg userParameters: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps.builder()

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun awsAccountRegion(awsAccountRegion: String) {
      cdkBuilder.awsAccountRegion(awsAccountRegion)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    override fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
      cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable::unwrap))
    }

    override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters)
    }

    override fun userParameters(vararg userParameters: Any): Unit =
        userParameters(userParameters.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProfileProps {
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    override fun awsAccountRegion(): String = unwrap(this).getAwsAccountRegion()

    override fun description(): String? = unwrap(this).getDescription()

    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    override fun environmentBlueprintIdentifier(): String =
        unwrap(this).getEnvironmentBlueprintIdentifier()

    override fun name(): String = unwrap(this).getName()

    override fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

    override fun userParameters(): Any? = unwrap(this).getUserParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps):
        CfnEnvironmentProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProfileProps):
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnEnvironmentProfileProps
  }
}
