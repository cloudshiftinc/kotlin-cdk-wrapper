package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Choice internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.Choice,
) : State(cdkObject) {
  public open fun afterwards(): Chain = unwrap(this).afterwards().let(Chain::wrap)

  public open fun afterwards(options: AfterwardsOptions): Chain =
      unwrap(this).afterwards(options.let(AfterwardsOptions::unwrap)).let(Chain::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9699f0c64c312dd5a726d45dae6f492949716da99d33bdd5412b1829250ebae3")
  public open fun afterwards(options: AfterwardsOptions.Builder.() -> Unit): Chain =
      afterwards(AfterwardsOptions(options))

  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public open fun otherwise(def: IChainable): Choice =
      unwrap(this).otherwise(def.let(IChainable::unwrap)).let(Choice::wrap)

  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  public open fun `when`(condition: Condition, next: IChainable): Choice =
      unwrap(this).`when`(condition.let(Condition::unwrap),
      next.let(IChainable::unwrap)).let(Choice::wrap)

  public open fun `when`(
    condition: Condition,
    next: IChainable,
    options: ChoiceTransitionOptions,
  ): Choice = unwrap(this).`when`(condition.let(Condition::unwrap), next.let(IChainable::unwrap),
      options.let(ChoiceTransitionOptions::unwrap)).let(Choice::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b780bf6265e81ac5f288c8abd8690e33fbec50c1de8b536e181e664673041650")
  public open fun `when`(
    condition: Condition,
    next: IChainable,
    options: ChoiceTransitionOptions.Builder.() -> Unit,
  ): Choice = `when`(condition, next, ChoiceTransitionOptions(options))

  public interface Builder {
    public fun comment(comment: String)

    public fun inputPath(inputPath: String)

    public fun outputPath(outputPath: String)

    public fun stateName(stateName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Choice.Builder =
        software.amazon.awscdk.services.stepfunctions.Choice.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Choice = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Choice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Choice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Choice): Choice =
        Choice(cdkObject)

    internal fun unwrap(wrapped: Choice): software.amazon.awscdk.services.stepfunctions.Choice =
        wrapped.cdkObject
  }
}
