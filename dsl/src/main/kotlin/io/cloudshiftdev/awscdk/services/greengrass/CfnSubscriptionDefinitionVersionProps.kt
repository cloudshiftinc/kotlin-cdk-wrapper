package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSubscriptionDefinitionVersionProps {
  /**
   * The ID of the subscription definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid)
   */
  public fun subscriptionDefinitionId(): String

  /**
   * The subscriptions in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
   */
  public fun subscriptions(): Any

  /**
   * A builder for [CfnSubscriptionDefinitionVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param subscriptionDefinitionId The ID of the subscription definition associated with this
     * version. 
     * This value is a GUID.
     */
    public fun subscriptionDefinitionId(subscriptionDefinitionId: String)

    /**
     * @param subscriptions The subscriptions in this version. 
     */
    public fun subscriptions(subscriptions: IResolvable)

    /**
     * @param subscriptions The subscriptions in this version. 
     */
    public fun subscriptions(subscriptions: List<Any>)

    /**
     * @param subscriptions The subscriptions in this version. 
     */
    public fun subscriptions(vararg subscriptions: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps.builder()

    /**
     * @param subscriptionDefinitionId The ID of the subscription definition associated with this
     * version. 
     * This value is a GUID.
     */
    override fun subscriptionDefinitionId(subscriptionDefinitionId: String) {
      cdkBuilder.subscriptionDefinitionId(subscriptionDefinitionId)
    }

    /**
     * @param subscriptions The subscriptions in this version. 
     */
    override fun subscriptions(subscriptions: IResolvable) {
      cdkBuilder.subscriptions(subscriptions.let(IResolvable::unwrap))
    }

    /**
     * @param subscriptions The subscriptions in this version. 
     */
    override fun subscriptions(subscriptions: List<Any>) {
      cdkBuilder.subscriptions(subscriptions)
    }

    /**
     * @param subscriptions The subscriptions in this version. 
     */
    override fun subscriptions(vararg subscriptions: Any): Unit =
        subscriptions(subscriptions.toList())

    public fun build():
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnSubscriptionDefinitionVersionProps {
    /**
     * The ID of the subscription definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptiondefinitionid)
     */
    override fun subscriptionDefinitionId(): String = unwrap(this).getSubscriptionDefinitionId()

    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinitionversion-subscriptions)
     */
    override fun subscriptions(): Any = unwrap(this).getSubscriptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSubscriptionDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps):
        CfnSubscriptionDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersionProps
  }
}
