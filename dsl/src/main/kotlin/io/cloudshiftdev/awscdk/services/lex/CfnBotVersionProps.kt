package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnBotVersionProps {
  /**
   * The unique identifier of the bot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botid)
   */
  public fun botId(): String

  /**
   * Specifies the locales that Amazon Lex adds to this version.
   *
   * You can choose the Draft version or any other previously published version for each locale.
   * When you specify a source version, the locale data is copied from the source version to the new
   * version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
   */
  public fun botVersionLocaleSpecification(): Any

  /**
   * The description of the version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A builder for [CfnBotVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param botId The unique identifier of the bot. 
     */
    public fun botId(botId: String)

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     */
    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable)

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     */
    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: List<Any>)

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     */
    public fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any)

    /**
     * @param description The description of the version.
     */
    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotVersionProps.Builder =
        software.amazon.awscdk.services.lex.CfnBotVersionProps.builder()

    /**
     * @param botId The unique identifier of the bot. 
     */
    override fun botId(botId: String) {
      cdkBuilder.botId(botId)
    }

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     */
    override fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable) {
      cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     */
    override fun botVersionLocaleSpecification(botVersionLocaleSpecification: List<Any>) {
      cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification)
    }

    /**
     * @param botVersionLocaleSpecification Specifies the locales that Amazon Lex adds to this
     * version. 
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     */
    override fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any): Unit =
        botVersionLocaleSpecification(botVersionLocaleSpecification.toList())

    /**
     * @param description The description of the version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBotVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lex.CfnBotVersionProps,
  ) : CdkObject(cdkObject), CfnBotVersionProps {
    /**
     * The unique identifier of the bot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botid)
     */
    override fun botId(): String = unwrap(this).getBotId()

    /**
     * Specifies the locales that Amazon Lex adds to this version.
     *
     * You can choose the Draft version or any other previously published version for each locale.
     * When you specify a source version, the locale data is copied from the source version to the new
     * version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-botversionlocalespecification)
     */
    override fun botVersionLocaleSpecification(): Any =
        unwrap(this).getBotVersionLocaleSpecification()

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botversion.html#cfn-lex-botversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBotVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotVersionProps):
        CfnBotVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBotVersionProps):
        software.amazon.awscdk.services.lex.CfnBotVersionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lex.CfnBotVersionProps
  }
}
