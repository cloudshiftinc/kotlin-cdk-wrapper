package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDataQualityRulesetProps {
  /**
   * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid
   * creating or starting multiple instances of the same resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-clienttoken)
   */
  public fun clientToken(): String? = unwrap(this).getClientToken()

  /**
   * A description of the data quality ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the data quality ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A Data Quality Definition Language (DQDL) ruleset.
   *
   * For more information see the AWS Glue Developer Guide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-ruleset)
   */
  public fun ruleset(): String? = unwrap(this).getRuleset()

  /**
   * A list of tags applied to the data quality ruleset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * An object representing an AWS Glue table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
   */
  public fun targetTable(): Any? = unwrap(this).getTargetTable()

  /**
   * A builder for [CfnDataQualityRulesetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientToken Used for idempotency and is recommended to be set to a random ID (such as
     * a UUID) to avoid creating or starting multiple instances of the same resource.
     */
    public fun clientToken(clientToken: String)

    /**
     * @param description A description of the data quality ruleset.
     */
    public fun description(description: String)

    /**
     * @param name The name of the data quality ruleset.
     */
    public fun name(name: String)

    /**
     * @param ruleset A Data Quality Definition Language (DQDL) ruleset.
     * For more information see the AWS Glue Developer Guide.
     */
    public fun ruleset(ruleset: String)

    /**
     * @param tags A list of tags applied to the data quality ruleset.
     */
    public fun tags(tags: Any)

    /**
     * @param targetTable An object representing an AWS Glue table.
     */
    public fun targetTable(targetTable: IResolvable)

    /**
     * @param targetTable An object representing an AWS Glue table.
     */
    public fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty)

    /**
     * @param targetTable An object representing an AWS Glue table.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b1d684fd96de3bf4beb5dbc7b38dd9a39037b5c421db70fa0c976fcdba6b489")
    public
        fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps.Builder
        = software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps.builder()

    /**
     * @param clientToken Used for idempotency and is recommended to be set to a random ID (such as
     * a UUID) to avoid creating or starting multiple instances of the same resource.
     */
    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    /**
     * @param description A description of the data quality ruleset.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the data quality ruleset.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ruleset A Data Quality Definition Language (DQDL) ruleset.
     * For more information see the AWS Glue Developer Guide.
     */
    override fun ruleset(ruleset: String) {
      cdkBuilder.ruleset(ruleset)
    }

    /**
     * @param tags A list of tags applied to the data quality ruleset.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param targetTable An object representing an AWS Glue table.
     */
    override fun targetTable(targetTable: IResolvable) {
      cdkBuilder.targetTable(targetTable.let(IResolvable::unwrap))
    }

    /**
     * @param targetTable An object representing an AWS Glue table.
     */
    override fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty) {
      cdkBuilder.targetTable(targetTable.let(CfnDataQualityRuleset.DataQualityTargetTableProperty::unwrap))
    }

    /**
     * @param targetTable An object representing an AWS Glue table.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b1d684fd96de3bf4beb5dbc7b38dd9a39037b5c421db70fa0c976fcdba6b489")
    override
        fun targetTable(targetTable: CfnDataQualityRuleset.DataQualityTargetTableProperty.Builder.() -> Unit):
        Unit = targetTable(CfnDataQualityRuleset.DataQualityTargetTableProperty(targetTable))

    public fun build(): software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps,
  ) : CdkObject(cdkObject), CfnDataQualityRulesetProps {
    /**
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid
     * creating or starting multiple instances of the same resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-clienttoken)
     */
    override fun clientToken(): String? = unwrap(this).getClientToken()

    /**
     * A description of the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A Data Quality Definition Language (DQDL) ruleset.
     *
     * For more information see the AWS Glue Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-ruleset)
     */
    override fun ruleset(): String? = unwrap(this).getRuleset()

    /**
     * A list of tags applied to the data quality ruleset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * An object representing an AWS Glue table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-dataqualityruleset.html#cfn-glue-dataqualityruleset-targettable)
     */
    override fun targetTable(): Any? = unwrap(this).getTargetTable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataQualityRulesetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps):
        CfnDataQualityRulesetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataQualityRulesetProps):
        software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps
  }
}
