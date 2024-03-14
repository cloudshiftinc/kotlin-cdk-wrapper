package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CommonGrantOptions {
  public fun actions(): List<String>

  public fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions() ?:
      emptyMap()

  public fun grantee(): IGrantable

  public fun resourceArns(): List<String>

  public interface Builder {
    public fun actions(actions: List<String>)

    public fun actions(vararg actions: String)

    public fun conditions(conditions: Map<String, Map<String, Any>>)

    public fun grantee(grantee: IGrantable)

    public fun resourceArns(resourceArns: List<String>)

    public fun resourceArns(vararg resourceArns: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CommonGrantOptions.Builder =
        software.amazon.awscdk.services.iam.CommonGrantOptions.builder()

    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    override fun conditions(conditions: Map<String, Map<String, Any>>) {
      cdkBuilder.conditions(conditions)
    }

    override fun grantee(grantee: IGrantable) {
      cdkBuilder.grantee(grantee.let(IGrantable::unwrap))
    }

    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    public fun build(): software.amazon.awscdk.services.iam.CommonGrantOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.CommonGrantOptions,
  ) : CommonGrantOptions {
    override fun actions(): List<String> = unwrap(this).getActions()

    override fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions() ?:
        emptyMap()

    override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

    override fun resourceArns(): List<String> = unwrap(this).getResourceArns()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CommonGrantOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CommonGrantOptions):
        CommonGrantOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonGrantOptions):
        software.amazon.awscdk.services.iam.CommonGrantOptions = (wrapped as Wrapper).cdkObject
  }
}
