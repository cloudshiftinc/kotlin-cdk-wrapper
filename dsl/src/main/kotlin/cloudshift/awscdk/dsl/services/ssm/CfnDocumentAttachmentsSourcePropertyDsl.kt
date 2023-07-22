@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnDocument

/**
 * Identifying information about a document attachment, including the file name and a key-value pair
 * that identifies the location of an attachment to a document.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * AttachmentsSourceProperty attachmentsSourceProperty = AttachmentsSourceProperty.builder()
 * .key("key")
 * .name("name")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-document-attachmentssource.html)
 */
@CdkDslMarker
public class CfnDocumentAttachmentsSourcePropertyDsl {
  private val cdkBuilder: CfnDocument.AttachmentsSourceProperty.Builder =
      CfnDocument.AttachmentsSourceProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param key The key of a key-value pair that identifies the location of an attachment to a
   * document.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param name The name of the document attachment file.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param values The value of a key-value pair that identifies the location of an attachment to a
   * document.
   * The format for *Value* depends on the type of key you specify.
   *
   * * For the key *SourceUrl* , the value is an S3 bucket location. For example:
   *
   * `"Values": [ "s3://doc-example-bucket/my-folder" ]`
   *
   * * For the key *S3FileUrl* , the value is a file in an S3 bucket. For example:
   *
   * `"Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]`
   *
   * * For the key *AttachmentReference* , the value is constructed from the name of another SSM
   * document in your account, a version number of that document, and a file attached to that document
   * version that you want to reuse. For example:
   *
   * `"Values": [ "MyOtherDocument/3/my-other-file.py" ]`
   *
   * However, if the SSM document is shared with you from another account, the full SSM document ARN
   * must be specified instead of the document name only. For example:
   *
   * `"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py"
   * ]`
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values The value of a key-value pair that identifies the location of an attachment to a
   * document.
   * The format for *Value* depends on the type of key you specify.
   *
   * * For the key *SourceUrl* , the value is an S3 bucket location. For example:
   *
   * `"Values": [ "s3://doc-example-bucket/my-folder" ]`
   *
   * * For the key *S3FileUrl* , the value is a file in an S3 bucket. For example:
   *
   * `"Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]`
   *
   * * For the key *AttachmentReference* , the value is constructed from the name of another SSM
   * document in your account, a version number of that document, and a file attached to that document
   * version that you want to reuse. For example:
   *
   * `"Values": [ "MyOtherDocument/3/my-other-file.py" ]`
   *
   * However, if the SSM document is shared with you from another account, the full SSM document ARN
   * must be specified instead of the document name only. For example:
   *
   * `"Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py"
   * ]`
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnDocument.AttachmentsSourceProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
