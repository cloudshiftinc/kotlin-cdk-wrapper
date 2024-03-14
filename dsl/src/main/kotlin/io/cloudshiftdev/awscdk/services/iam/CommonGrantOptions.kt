package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CommonGrantOptions {
  /**
   * The actions to grant.
   */
  public fun actions(): List<String>

  /**
   * Any conditions to attach to the grant.
   *
   * Default: - No conditions
   */
  public fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions() ?:
      emptyMap()

  /**
   * The principal to grant to.
   *
   * Default: if principal is undefined, no work is done.
   */
  public fun grantee(): IGrantable

  /**
   * The resource ARNs to grant to.
   */
  public fun resourceArns(): List<String>

  /**
   * A builder for [CommonGrantOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions to grant. 
     */
    public fun actions(actions: List<String>)

    /**
     * @param actions The actions to grant. 
     */
    public fun actions(vararg actions: String)

    /**
     * @param conditions Any conditions to attach to the grant.
     */
    public fun conditions(conditions: Map<String, Map<String, Any>>)

    /**
     * @param grantee The principal to grant to. 
     */
    public fun grantee(grantee: IGrantable)

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    public fun resourceArns(resourceArns: List<String>)

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    public fun resourceArns(vararg resourceArns: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CommonGrantOptions.Builder =
        software.amazon.awscdk.services.iam.CommonGrantOptions.builder()

    /**
     * @param actions The actions to grant. 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions The actions to grant. 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * @param conditions Any conditions to attach to the grant.
     */
    override fun conditions(conditions: Map<String, Map<String, Any>>) {
      cdkBuilder.conditions(conditions)
    }

    /**
     * @param grantee The principal to grant to. 
     */
    override fun grantee(grantee: IGrantable) {
      cdkBuilder.grantee(grantee.let(IGrantable::unwrap))
    }

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    /**
     * @param resourceArns The resource ARNs to grant to. 
     */
    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    public fun build(): software.amazon.awscdk.services.iam.CommonGrantOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CommonGrantOptions,
  ) : CdkObject(cdkObject), CommonGrantOptions {
    /**
     * The actions to grant.
     */
    override fun actions(): List<String> = unwrap(this).getActions()

    /**
     * Any conditions to attach to the grant.
     *
     * Default: - No conditions
     */
    override fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions() ?:
        emptyMap()

    /**
     * The principal to grant to.
     *
     * Default: if principal is undefined, no work is done.
     */
    override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

    /**
     * The resource ARNs to grant to.
     */
    override fun resourceArns(): List<String> = unwrap(this).getResourceArns()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonGrantOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CommonGrantOptions):
        CommonGrantOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonGrantOptions):
        software.amazon.awscdk.services.iam.CommonGrantOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iam.CommonGrantOptions
  }
}
