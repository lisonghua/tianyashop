#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package weixin.idea.photo.service;

import ${package}.core.common.service.CommonService;

import weixin.idea.photo.entity.WeixinPhotoAlbumEntity;
import weixin.idea.photo.entity.WeixinPhotoEntity;

public interface WeixinPhotoAlbumServiceI extends CommonService{
	/**
	 * 删除文件
	 * @param file
	 */
	public void deleteFile(WeixinPhotoEntity file);
	/**
	 * 删除全部相册文件
	 * @param file
	 */
	public void deleteFiles(WeixinPhotoAlbumEntity weixinPhotoAlbum);
}
