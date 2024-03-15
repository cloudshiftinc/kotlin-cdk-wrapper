@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnSolutionProps {
  public fun datasetGroupArn(): String

  public fun eventType(): String? = unwrap(this).getEventType()

  public fun name(): String

  public fun performAutoMl(): Any? = unwrap(this).getPerformAutoMl()

  public fun performHpo(): Any? = unwrap(this).getPerformHpo()

  public fun recipeArn(): String? = unwrap(this).getRecipeArn()

  public fun solutionConfig(): Any? = unwrap(this).getSolutionConfig()

  @CdkDslMarker
  public interface Builder {
    public fun datasetGroupArn(datasetGroupArn: String)

    public fun eventType(eventType: String)

    public fun name(name: String)

    public fun performAutoMl(performAutoMl: Boolean)

    public fun performAutoMl(performAutoMl: IResolvable)

    public fun performHpo(performHpo: Boolean)

    public fun performHpo(performHpo: IResolvable)

    public fun recipeArn(recipeArn: String)

    public fun solutionConfig(solutionConfig: IResolvable)

    public fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f08e0cfe3927e144926376a24818d32e60b350ff8a7491d6b3c45e60c4cc1db")
    public fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnSolutionProps.Builder =
        software.amazon.awscdk.services.personalize.CfnSolutionProps.builder()

    override fun datasetGroupArn(datasetGroupArn: String) {
      cdkBuilder.datasetGroupArn(datasetGroupArn)
    }

    override fun eventType(eventType: String) {
      cdkBuilder.eventType(eventType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun performAutoMl(performAutoMl: Boolean) {
      cdkBuilder.performAutoMl(performAutoMl)
    }

    override fun performAutoMl(performAutoMl: IResolvable) {
      cdkBuilder.performAutoMl(performAutoMl.let(IResolvable::unwrap))
    }

    override fun performHpo(performHpo: Boolean) {
      cdkBuilder.performHpo(performHpo)
    }

    override fun performHpo(performHpo: IResolvable) {
      cdkBuilder.performHpo(performHpo.let(IResolvable::unwrap))
    }

    override fun recipeArn(recipeArn: String) {
      cdkBuilder.recipeArn(recipeArn)
    }

    override fun solutionConfig(solutionConfig: IResolvable) {
      cdkBuilder.solutionConfig(solutionConfig.let(IResolvable::unwrap))
    }

    override fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty) {
      cdkBuilder.solutionConfig(solutionConfig.let(CfnSolution.SolutionConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f08e0cfe3927e144926376a24818d32e60b350ff8a7491d6b3c45e60c4cc1db")
    override
        fun solutionConfig(solutionConfig: CfnSolution.SolutionConfigProperty.Builder.() -> Unit):
        Unit = solutionConfig(CfnSolution.SolutionConfigProperty(solutionConfig))

    public fun build(): software.amazon.awscdk.services.personalize.CfnSolutionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.personalize.CfnSolutionProps,
  ) : CdkObject(cdkObject), CfnSolutionProps {
    override fun datasetGroupArn(): String = unwrap(this).getDatasetGroupArn()

    override fun eventType(): String? = unwrap(this).getEventType()

    override fun name(): String = unwrap(this).getName()

    override fun performAutoMl(): Any? = unwrap(this).getPerformAutoMl()

    override fun performHpo(): Any? = unwrap(this).getPerformHpo()

    override fun recipeArn(): String? = unwrap(this).getRecipeArn()

    override fun solutionConfig(): Any? = unwrap(this).getSolutionConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSolutionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSolutionProps):
        CfnSolutionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSolutionProps):
        software.amazon.awscdk.services.personalize.CfnSolutionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.personalize.CfnSolutionProps
  }
}
