package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Itemone;

public interface IItemoneDAO {
	/**
	 * ����һ����������
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public boolean doCreateItemone(Itemone vo) throws Exception;
	/**
	 * ����һ���˵���ɾ��
	 * @param ioid ��������һ���˵��ı��
	 * @return
	 * @throws Exception
	 */
	public boolean doRemoveItemone(int ioid) throws Exception;
	/**
	 * ����һ���˵��ĸ���
	 * @param vo ����ioid �� title
	 * @return
	 * @throws Exception
	 */
	public boolean updateItemone(Itemone vo) throws Exception;
	/**
	 * ��ѯ�����е�һ���˵�
	 * @return
	 * @throws Exception
	 */
	public List<Itemone> findAllItemone() throws Exception;
	/**
	 * ���ݱ�Ų�ѯ��ĳ������˵�
	 * @param ioid
	 * @return
	 * @throws Exception
	 */
	public Itemone findItemoneById(int ioid) throws Exception;
	
}
