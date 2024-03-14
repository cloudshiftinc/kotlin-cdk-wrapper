package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDatabaseProps {
  /**
   * The AWS account ID for the account in which to create the catalog object.
   *
   *
   * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
   * pseudo parameter. For example: `!Ref AWS::AccountId`
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid)
   */
  public fun catalogId(): String

  /**
   * The metadata for the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
   */
  public fun databaseInput(): Any

  /**
   * A builder for [CfnDatabaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalogId The AWS account ID for the account in which to create the catalog object. 
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     */
    public fun catalogId(catalogId: String)

    /**
     * @param databaseInput The metadata for the database. 
     */
    public fun databaseInput(databaseInput: IResolvable)

    /**
     * @param databaseInput The metadata for the database. 
     */
    public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty)

    /**
     * @param databaseInput The metadata for the database. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dc75074e2c37451f80d699516d33a089a9ef326bf074b07ded67c1d13231f51")
    public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDatabaseProps.Builder =
        software.amazon.awscdk.services.glue.CfnDatabaseProps.builder()

    /**
     * @param catalogId The AWS account ID for the account in which to create the catalog object. 
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param databaseInput The metadata for the database. 
     */
    override fun databaseInput(databaseInput: IResolvable) {
      cdkBuilder.databaseInput(databaseInput.let(IResolvable::unwrap))
    }

    /**
     * @param databaseInput The metadata for the database. 
     */
    override fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty) {
      cdkBuilder.databaseInput(databaseInput.let(CfnDatabase.DatabaseInputProperty::unwrap))
    }

    /**
     * @param databaseInput The metadata for the database. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dc75074e2c37451f80d699516d33a089a9ef326bf074b07ded67c1d13231f51")
    override fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty.Builder.() -> Unit):
        Unit = databaseInput(CfnDatabase.DatabaseInputProperty(databaseInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnDatabaseProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnDatabaseProps,
  ) : CdkObject(cdkObject), CfnDatabaseProps {
    /**
     * The AWS account ID for the account in which to create the catalog object.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid)
     */
    override fun catalogId(): String = unwrap(this).getCatalogId()

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     */
    override fun databaseInput(): Any = unwrap(this).getDatabaseInput()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatabaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabaseProps):
        CfnDatabaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatabaseProps):
        software.amazon.awscdk.services.glue.CfnDatabaseProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnDatabaseProps
  }
}
