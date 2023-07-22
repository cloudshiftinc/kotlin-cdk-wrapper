@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotDataPrivacyPropertyDsl {
  private val cdkBuilder: CfnBot.DataPrivacyProperty.Builder = CfnBot.DataPrivacyProperty.builder()

  /**
   * @param childDirected For each Amazon Lex bot created with the Amazon Lex Model Building
   * Service, you must specify whether your use of Amazon Lex is related to a website, program, or
   * other application that is directed or targeted, in whole or in part, to children under age 13 and
   * subject to the Children's Online Privacy Protection Act (COPPA) by specifying `true` or `false` in
   * the `childDirected` field. 
   * By specifying `true` in the `childDirected` field, you confirm that your use of Amazon Lex *is*
   * related to a website, program, or other application that is directed or targeted, in whole or in
   * part, to children under age 13 and subject to COPPA. By specifying `false` in the `childDirected`
   * field, you confirm that your use of Amazon Lex *is not* related to a website, program, or other
   * application that is directed or targeted, in whole or in part, to children under age 13 and
   * subject to COPPA. You may not specify a default value for the `childDirected` field that does not
   * accurately reflect whether your use of Amazon Lex is related to a website, program, or other
   * application that is directed or targeted, in whole or in part, to children under age 13 and
   * subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application
   * that is directed in whole or in part, to children under age 13, you must obtain any required
   * verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in
   * connection with websites, programs, or other applications that are directed or targeted, in whole
   * or in part, to children under age 13, see the [Amazon Lex
   * FAQ](https://docs.aws.amazon.com/lex/faqs#data-security) .
   */
  public fun childDirected(childDirected: Boolean) {
    cdkBuilder.childDirected(childDirected)
  }

  /**
   * @param childDirected For each Amazon Lex bot created with the Amazon Lex Model Building
   * Service, you must specify whether your use of Amazon Lex is related to a website, program, or
   * other application that is directed or targeted, in whole or in part, to children under age 13 and
   * subject to the Children's Online Privacy Protection Act (COPPA) by specifying `true` or `false` in
   * the `childDirected` field. 
   * By specifying `true` in the `childDirected` field, you confirm that your use of Amazon Lex *is*
   * related to a website, program, or other application that is directed or targeted, in whole or in
   * part, to children under age 13 and subject to COPPA. By specifying `false` in the `childDirected`
   * field, you confirm that your use of Amazon Lex *is not* related to a website, program, or other
   * application that is directed or targeted, in whole or in part, to children under age 13 and
   * subject to COPPA. You may not specify a default value for the `childDirected` field that does not
   * accurately reflect whether your use of Amazon Lex is related to a website, program, or other
   * application that is directed or targeted, in whole or in part, to children under age 13 and
   * subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application
   * that is directed in whole or in part, to children under age 13, you must obtain any required
   * verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in
   * connection with websites, programs, or other applications that are directed or targeted, in whole
   * or in part, to children under age 13, see the [Amazon Lex
   * FAQ](https://docs.aws.amazon.com/lex/faqs#data-security) .
   */
  public fun childDirected(childDirected: IResolvable) {
    cdkBuilder.childDirected(childDirected)
  }

  public fun build(): CfnBot.DataPrivacyProperty = cdkBuilder.build()
}
