@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTopicProps {
  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public fun dataSets(): Any? = unwrap(this).getDataSets()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun topicId(): String? = unwrap(this).getTopicId()

  public fun userExperienceVersion(): String? = unwrap(this).getUserExperienceVersion()

  @CdkDslMarker
  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun dataSets(dataSets: IResolvable)

    public fun dataSets(dataSets: List<Any>)

    public fun dataSets(vararg dataSets: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun topicId(topicId: String)

    public fun userExperienceVersion(userExperienceVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnTopicProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnTopicProps.builder()

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun dataSets(dataSets: IResolvable) {
      cdkBuilder.dataSets(dataSets.let(IResolvable::unwrap))
    }

    override fun dataSets(dataSets: List<Any>) {
      cdkBuilder.dataSets(dataSets)
    }

    override fun dataSets(vararg dataSets: Any): Unit = dataSets(dataSets.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun topicId(topicId: String) {
      cdkBuilder.topicId(topicId)
    }

    override fun userExperienceVersion(userExperienceVersion: String) {
      cdkBuilder.userExperienceVersion(userExperienceVersion)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnTopicProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnTopicProps,
  ) : CdkObject(cdkObject), CfnTopicProps {
    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    override fun dataSets(): Any? = unwrap(this).getDataSets()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun topicId(): String? = unwrap(this).getTopicId()

    override fun userExperienceVersion(): String? = unwrap(this).getUserExperienceVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopicProps):
        CfnTopicProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicProps):
        software.amazon.awscdk.services.quicksight.CfnTopicProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.quicksight.CfnTopicProps
  }
}
