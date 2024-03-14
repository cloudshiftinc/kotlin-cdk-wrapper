package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConnectionProps {
  /**
   * The ID of the data catalog to create the catalog object in.
   *
   * Currently, this should be the AWS account ID.
   *
   *
   * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
   * pseudo parameter. For example: `!Ref AWS::AccountId` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
   */
  public fun catalogId(): String

  /**
   * The connection that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
   */
  public fun connectionInput(): Any

  /**
   * A builder for [CfnConnectionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalogId The ID of the data catalog to create the catalog object in. 
     * Currently, this should be the AWS account ID.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     */
    public fun catalogId(catalogId: String)

    /**
     * @param connectionInput The connection that you want to create. 
     */
    public fun connectionInput(connectionInput: IResolvable)

    /**
     * @param connectionInput The connection that you want to create. 
     */
    public fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty)

    /**
     * @param connectionInput The connection that you want to create. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("228d8b18a12331284361a76bd08962f8e3d3275a3380f994908ea0a9f77d721e")
    public
        fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnConnectionProps.Builder =
        software.amazon.awscdk.services.glue.CfnConnectionProps.builder()

    /**
     * @param catalogId The ID of the data catalog to create the catalog object in. 
     * Currently, this should be the AWS account ID.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param connectionInput The connection that you want to create. 
     */
    override fun connectionInput(connectionInput: IResolvable) {
      cdkBuilder.connectionInput(connectionInput.let(IResolvable::unwrap))
    }

    /**
     * @param connectionInput The connection that you want to create. 
     */
    override fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty) {
      cdkBuilder.connectionInput(connectionInput.let(CfnConnection.ConnectionInputProperty::unwrap))
    }

    /**
     * @param connectionInput The connection that you want to create. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("228d8b18a12331284361a76bd08962f8e3d3275a3380f994908ea0a9f77d721e")
    override
        fun connectionInput(connectionInput: CfnConnection.ConnectionInputProperty.Builder.() -> Unit):
        Unit = connectionInput(CfnConnection.ConnectionInputProperty(connectionInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnConnectionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnConnectionProps,
  ) : CdkObject(cdkObject), CfnConnectionProps {
    /**
     * The ID of the data catalog to create the catalog object in.
     *
     * Currently, this should be the AWS account ID.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
     */
    override fun catalogId(): String = unwrap(this).getCatalogId()

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     */
    override fun connectionInput(): Any = unwrap(this).getConnectionInput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnectionProps):
        CfnConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectionProps):
        software.amazon.awscdk.services.glue.CfnConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnConnectionProps
  }
}
